package com.cognizant;  
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;  
  
public class Employee {  
  
    private String name;  
    //@Size(min=1,message="required")  
    @Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})",message=" 6 to 20 characters string with at least one digit, one upper case letter, one lower case letter and one special symbol (“@#$%”)")
    private String pass;  
    @Min(value=18,message="must be equal or greater than 18")
    @Max(value=45, message="must be equal or less than 45")
    private int age;
      
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getPass() {  
        return pass;  
    }  
    public void setPass(String pass) {  
        this.pass = pass;  
    }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}     
    
}  