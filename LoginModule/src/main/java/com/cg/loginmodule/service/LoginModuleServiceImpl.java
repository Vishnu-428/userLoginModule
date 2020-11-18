package com.cg.loginmodule.service;

import com.cg.loginmodule.entities.LoginData;

public interface LoginModuleServiceImpl {

	public LoginData findByID(String userId);
}
