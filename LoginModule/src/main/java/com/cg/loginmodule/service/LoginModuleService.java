package com.cg.loginmodule.service;
import com.cg.loginmodule.entities.LoginData;
/*
 * ServiceLayer
 * @author VishnuVardhan
 */
public interface LoginModuleService {
	
	public LoginData findByID(String userId);
}
