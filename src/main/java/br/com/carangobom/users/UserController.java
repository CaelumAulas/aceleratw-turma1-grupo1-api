package br.com.carangobom.users;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

   private final UserService service;

    @GetMapping
   public List<UserDto> list() {
        return service.ListAllUsers();
    }
    
    @PostMapping
    public ResponseEntity<UserDto> persistUser(@RequestBody UserForm userForm) {
    	
    	service.saveUser(userForm);
    	
    	return new ResponseEntity<>(HttpStatus.OK);
    }

    
    @GetMapping(path = "/login")
    public ResponseEntity<HttpStatus> Login(@RequestBody UserForm userForm){
    	
    	if(service.login(userForm)) return new ResponseEntity<>(HttpStatus.OK);
    	
    	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    

}
