package br.com.carangobom.users;

import br.com.carangobom.domain.User;

public class UserDto {

	private String login;
	
	public UserDto(User source) {
		this.login = source.getLogin();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	

}
