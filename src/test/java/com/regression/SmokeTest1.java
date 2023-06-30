package com.regression;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generic.LoginTesting1;

public class SmokeTest1 {
	@Test
	public void testRun() throws IOException {
		LoginTesting1 obj = new LoginTesting1();	
        obj.getLogin1();
	}

}


