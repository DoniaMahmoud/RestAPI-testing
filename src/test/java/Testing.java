import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

import org.json.JSONObject;

import com.example.consumingrest.Countries;
import com.example.consumingrest.StaticData;
import org.testng.annotations.Test;


class Testing {
     StaticData data = new StaticData();

	@Test
	void testName() {
		final String expected = "Congo";
		final String actual = data.getString("name");	
		Assert.assertEquals(actual,expected);
	}
	
	@Test
	void testCaptial() {
		final String expected = "Brazzaville";
		final String actual = data.getString("capital");	
		Assert.assertEquals(actual,expected);
	}
	@Test
	void testPopulation() {
		final int expected = 4741000;
		final int actual = data.getInt("population");
		
		Assert.assertEquals(actual,expected);
	}
	
	@Test
	void testCountryName() {
	   String expected = "Egypt";
       Countries countries = new Countries();
       countries.setName(expected);
       String actual=  countries.getName();
       Assert.assertEquals(actual, expected);
	}
    
    
    @Test
	void testCountryCap() {
	   String expected = "Cairo";
       Countries countries = new Countries();
       countries.setCap(expected);
       String actual=  countries.getCap();
       Assert.assertEquals(actual, expected);
	}
    
    
    @Test
	void testCountryPop() {
	   int expected = 91290000;
       Countries countries = new Countries();
       countries.setPop(expected);
       int actual=  countries.getPop();
       Assert.assertEquals(actual, expected);
	}
    
    @Test
	void integrationTest() {
		final boolean expected =true;
		final boolean actual =data.CheckAll();
		Assert.assertEquals(actual, expected);
		
	};
    
    

}

