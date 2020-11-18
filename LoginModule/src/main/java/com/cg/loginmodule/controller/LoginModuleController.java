package com.cg.loginmodule.controller;


import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.loginmodule.LoginModuleApplication;
import com.cg.loginmodule.entities.LoginData;
import com.cg.loginmodule.exceptions.ResourceNotFoundException;
import com.cg.loginmodule.service.LoginModuleService;
	@RestController
	@RequestMapping("/validate")
	public class LoginModuleController {
		static LoginData data;
		//BasicConfigurator.configure();
		Logger logger=Logger.getLogger(LoginModuleController.class);
		@Autowired
		private LoginModuleService service;
		
		@GetMapping("/Login1/{userId}/{password}/{type}")
		public ResponseEntity<String> validateUser(@PathVariable(value = "userId") String userId,@PathVariable(value="password") String password,@PathVariable(value="type") String type)
				throws ResourceNotFoundException {
			
			Logger logger=Logger.getLogger(LoginData.class);
				data =  service.findByID(userId);
				logger.info("ending services");
						//.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));
				if(data!=null)
				{
				if(data.getPassword().equals(password) && data.getUserId().equals(userId) && data.getType().equals(type))
				{
					logger.info("sucess");
					System.out.println("sucess");
					
					return ResponseEntity.ok().body("sucess login");
				}
				}else
				{
					throw new ResourceNotFoundException("Employee not found for this id :: " + userId);
					}
			
			return ResponseEntity.ok().body("invalid login");
		}	
	}
