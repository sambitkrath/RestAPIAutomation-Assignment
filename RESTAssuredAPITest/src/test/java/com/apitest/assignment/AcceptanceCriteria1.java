package com.apitest.assignment;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import com.restapi.utils.ReusableMethods;
//import org.apache.logging.log4j.*;
import org.testng.annotations.BeforeTest;
import io.restassured.specification.ResponseSpecification;

public class AcceptanceCriteria1 {
	
	//Optional - Log4j Logger can be used as Restassured has its own log
	//private static Logger log =LogManager.getLogger(basics3.class.getName());
	
	//ResponseSpecification object declaration
	static ResponseSpecification responseSpec;
	
	//Initialization of class containing reusable methods and constants
	ReusableMethods steps = new ReusableMethods();
	
	@BeforeTest
	public static void init(){
		
		    //Initialization of BaseURI or Host 
			RestAssured.baseURI = "https://api.tmsandbox.co.nz";
			RestAssured.basePath="/v1";
			
			//Optional - Log4j Logger can be used for logging
			//log.info("Host information"+prop.getProperty("baseURI"));
			
			//Inilialization of ResponseSpecification
			responseSpec= ReusableMethods.getGenericResponseSpec();
			
			//Validation of status code for response
			responseSpec.statusCode(200);
			
			//Validation of Name Element having value "Carbon credits" is passed to Response Spec
			responseSpec.body("Name",equalTo(ReusableMethods.categoryName));
						
	}
	
	@Test
	// This test will validate Name as Carbon Credits through response spec object
	public void APIAssignmentAcceptanceCriteria1(){
									   	       
		        /**
		          * API testing using RestAssured methods		          * 
				  * given()
				  * set cookies,add auth,adding parameters,setting header info
				  * .when()
				  *  GET,POST,PUT,DELETE..etc
				  * .then()
				  * .statuscode()
				  * .log()
				  * .all()
				  *  Validate status code,extract response, extract headers,cookies,extract the response body
				  * .spec()
				  *  passing ResponseSpecification object as an arguement
				  *  
				  */
		            
		           // ReusableMethods.getReponse is called and ResponseSpec is passed as arguement
					steps.getResponse(ReusableMethods.endPointURL)
					.statusCode(200)
					.log()
					.all()
					.spec(responseSpec);
									
					
}

}
