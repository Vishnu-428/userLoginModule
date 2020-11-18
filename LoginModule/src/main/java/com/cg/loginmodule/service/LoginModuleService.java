package com.cg.loginmodule.service;


import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.loginmodule.entities.LoginData;
import com.cg.loginmodule.repostry.LoginRepostry;

@Service
public class LoginModuleService implements LoginModuleServiceImpl{
@Autowired
private LoginRepostry repostry;

public LoginData findByID(String userId) {
	Logger logger=Logger.getLogger(LoginModuleService.class);
	logger.info("entering services");
	return repostry.findByID(userId);	
}




}
