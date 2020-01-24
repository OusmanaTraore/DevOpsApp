package com.wunderit.devops;

import static org.junit.Assert.assertTrue;
import com.wunderit.devops.controller.LoginController;
import org.junit.Test;

public class DevOpsApplicationTests {

    @Test
    public void testLoginController() {
        final LoginController loginController = new LoginController();
		final String result = loginController.loginMessage();
        assertTrue(result.length() > 0);
    }

}