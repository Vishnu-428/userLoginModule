package com.cg.loginmodule.test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.loginmodule.entities.LoginData;
import com.cg.loginmodule.repostry.LoginRepostry;
import com.cg.loginmodule.service.LoginModuleService;
@RunWith(SpringRunner.class)
@SpringBootTest
class LoginModuleServiceTest {
	  @MockBean
	   private LoginRepostry repostry;

	    @Autowired
	    private LoginModuleService service;

	@Test
	void ValidateData() {
		LoginData data=new LoginData();
		data.setUserId("1");
		data.setPassword("vishnu");
		data.setType("manager");
       Mockito.when(repostry.findByID("1")).thenReturn(data);
//       assertEquals(data.getUserId(),"1");
        assertThat(service.findByID("1")).isEqualTo(data);
        //zassertEquals(data,service.findByID("1"));
        
	}

}
