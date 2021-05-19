package br.com.carangobom.users;

import org.springframework.stereotype.Component;

import br.com.carangobom.domain.User;
import br.com.carangobom.infra.Mapper;

@Component
public class UserViewMapper implements Mapper<User, UserDto>{

	@Override
	public UserDto map(User source) {
		
		return new UserDto(source);
	}

}
