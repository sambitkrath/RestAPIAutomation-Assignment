package com.apitest.assignment;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.restapi.utils.ReusableMethods;


public class AcceptanceCriteria2 {
	
	//Initialization of class containing reusable methods and constants
	ReusableMethods steps = new ReusableMethods();
		
	@Test
	//This test will validate CanRelist element value as true
	public void APIAssignmentAcceptanceCriteria2(){
		/**
		 * given()
		 * set cookies,add auth,adding parameters,setting header info
		 * .when()
		 *  GET,POST,PUT,DELETE..etc
		 * .then()
		 *  Validate status code,extract response, extract headers,cookies,extract the response body
		 * .statuscode(200) 
		 *  returning status code 200 - Status - Success
		 *  .extract.path()
		 *  Extracting the JsonPath Matched String
		 *  
		 */
	
		// Validation - JsonPath Matched String 'CanRelist' as true
		Assert.assertTrue((Boolean) steps.getResponse(ReusableMethods.endPointURL)
		.statusCode(200)
		.log()
		.all()
		.extract().path(ReusableMethods.canRelistKey));
		 
		 
        
}
	
}
