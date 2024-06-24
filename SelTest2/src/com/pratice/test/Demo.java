package com.pratice.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

		@Test
		public void CreateCustomer() {
			Reporter.log("Create Customer", true);
		}

		@Test
		public void ModifyCustomer() {
			Reporter.log("Modify Customer", true);
			
		}
		
		@Test
		public void DeleteCustomer() {
			Reporter.log("Delete Customer", true);
		}
}

