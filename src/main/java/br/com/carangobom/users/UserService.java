package br.com.carangobom.users;

import java.util.List;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carangobom.domain.User;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

	@Autowired
	private UserRepository repository;
	@Autowired
	private UserViewMapper viewMapper;
	private UserFormMapper formMapper;
	
	
	public List<UserDto> ListAllUsers(){
		return repository.findAll().stream().map(viewMapper::map).collect(Collectors.toList());
				
	}
	
	public void saveUser(UserForm userForm) {
		
		// regras de negócio para persistir o usuário
		
		List<User> users = repository.findUsers(userForm.getLogin());
		
			if(!users.isEmpty()) throw new RuntimeErrorException(null, "User already exists");
		
		
		 var user = formMapper.map(userForm);
		repository.save(user);
	}
}
