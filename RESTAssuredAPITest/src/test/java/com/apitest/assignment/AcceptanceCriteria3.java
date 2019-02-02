package com.apitest.assignment;

import java.util.HashMap;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import com.restapi.utils.ReusableMethods;

public class AcceptanceCriteria3 {

	//Initialization of class containing reusable methods and constants
	ReusableMethods steps = new ReusableMethods();

	@Test
	//"This test will validate Description of Promotion Element contains text '2x larger image"
	public void APIAssignmentAcceptanceCriteria3(){
	
		//Returning Promotion Element Hash Object
		HashMap<String,String> responseHashObj = steps.getDescriptionByNameOfPromotionElement(ReusableMethods.promotionElementName,ReusableMethods.endPointURL);
	
		//Validation - Promotion Element description with Name = 'Gallery' is validated of contains text '2x larger image'
		org.hamcrest.MatcherAssert.assertThat(responseHashObj.get(ReusableMethods.descriptionKey),containsString(ReusableMethods.descriptionSubstring));
}
}

		