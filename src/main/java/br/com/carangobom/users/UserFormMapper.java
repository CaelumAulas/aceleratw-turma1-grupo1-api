package br.com.carangobom.users;

import org.springframework.stereotype.Component;

import br.com.carangobom.domain.User;
import br.com.carangobom.infra.Mapper;

@Component
public class UserFormMapper implements Mapper<UserForm, User>{

	@Override
	public User map(UserForm source) {
		// TODO Auto-generated method stub
		return new User(source.getLogin(),source.getPassword());
	}

}
