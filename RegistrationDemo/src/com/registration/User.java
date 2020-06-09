package com.registration;

import java.util.Date;
public class User {
private int id;
private String name;
private String address;
private String gender;
private Date dob;
private String password;
static int counter;
public User(String name, String address, String gender, Date dob, String password) {
super();
id=++counter;
this.name = name;
this.address = address;
this.gender = gender;
this.dob = dob;
this.password = password;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public Date getDob() {
return dob;
}
public void setDob(Date dob) {
this.dob = dob;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}



}
