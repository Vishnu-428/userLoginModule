package com.cg.loginmodule.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="LoginData")
public class LoginData {
	
private String userId;
private String password;
private String type;
@Id
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
@Column(name = "Password", nullable = false)
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Column(name = "type", nullable = false)
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "LoginData [userId=" + userId + ", password=" + password + ", type=" + type + "]";
}
public LoginData(String userId, String password, String type) {
	super();
	this.userId = userId;
	this.password = password;
	this.type = type;
}
public LoginData() {
	super();
	// TODO Auto-generated constructor stub
}


}
