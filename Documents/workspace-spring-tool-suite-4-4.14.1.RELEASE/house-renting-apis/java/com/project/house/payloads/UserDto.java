package com.project.house.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class UserDto{
	
	
    private int id;
    
	@NotEmpty
	@Size(min = 4,max = 15, message= "Name cannot be less than 4 and greater than 15." )
    private String name;
    
	@Email(message= "Email must be valid.")
    private String email;
    
	@NotEmpty
	@Size(min=2, max=15, message="Password must be between 2 and 15 characters.")
    private String password;
    
    
    @NotEmpty
    private String role;
}
              