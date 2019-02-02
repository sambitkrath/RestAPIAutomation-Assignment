package com.restapi.utils;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import io.restassured.response.ValidatableResponse;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ReusableMethods {
	
	//Constants Declarations and initialisations
	public static ResponseSpecBuilder responseBuilder;
	public static ResponseSpecification responseSpec;
	public static String promotionElementName="Gallery";
	public static String categoryName="Carbon credits";
	public static String endPointURL = "/Categories/6327/Details.json?catalogue=false";
	public static String canRelistKey = "CanRelist";
	public static String descriptionKey ="Description";
	public static String descriptionSubstring="2x larger image";
	
	//Properties variable declaration
	Properties prop=new Properties();
	
	//Declaration of request builder object
	public static RequestSpecBuilder rspec;
	
	//Declaration of request specification object
	public static RequestSpecification requestSpecification;
	
	//Declaration of response builder object
	public static ResponseSpecBuilder respec;
	
	//Declaration of response specification object
	public static ResponseSpecification responseSpecification;
    
	// Returns genereic Request Specification Object			
	public static RequestSpecification getGenericRequestSpec(){
		rspec = new RequestSpecBuilder();
		rspec.setContentType(ContentType.JSON);
		requestSpecification = rspec.build();
		return requestSpecification;
	}
	// Returns genereic Response Specification Object
	public static ResponseSpecification getGenericResponseSpec(){
		respec = new ResponseSpecBuilder();
		respec.expectHeader("Content-Type","application/json");
		//respec.expectHeader("Transfer-Encoding","chunked");
		responseSpecification = respec.build();
		return responseSpecification;
		
	}
	// Returns Validatable response object
	public ValidatableResponse getResponse(String endPointURL){
		
		return   given()
				.spec(getGenericRequestSpec())
				.when()
				.get(endPointURL)
				.then();
		}

	//Returns Hashmap object after jsonpath match
	public HashMap<String,String> getDescriptionByNameOfPromotionElement(String promotionElementName,String endPointURL){
		String jsonPathMatchString1 = "Promotions.findAll{it.Name=='";
		String jsonPathMatchString2 = "'}.get(0)";
		
	return given()
		  .when()
		  .get(endPointURL)
		  .then()
		  .log()
		  .all()
		  .extract()
		  .path(jsonPathMatchString1+promotionElementName+jsonPathMatchString2);
	}
	public void getData() throws IOException
	{
		// \RESTAssuredTest\src\main\java\config\env.properties
		FileInputStream filInputStream=new FileInputStream(System.getProperty("user.dir")+"//env.properties");
		prop.load(filInputStream);
		//prop.get("baseURI");
	}
}




	
	

