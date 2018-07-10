package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Function {
	
	static WebDriver driver;
	static String url;
	static long start;
	static long finish;
	
	public static void open(String url) {
		Logger.getLogger("").setLevel(Level.OFF);
		driver = new HtmlUnitDriver();
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url); 
		
		}
	
	public static boolean isPresent(By by) {
		if (driver.findElements(by).size() > 0) return true;
		else return false; 
		}
	
	public static boolean isVisible(By by) {
		if ((driver.findElements(by).size() > 0) && driver.findElement(by).isDisplayed()) return true;
		else return false; 
		}
	
static By el_01 = By.id("id_quotes");						//signup              
	
	static By el_02 = By.id("id_current_location");				//signup
	static By el_03 = By.id("id_weather_icon");					//signup
	static By el_04 = By.id("id_temperature");					//signup
	static By el_05 = By.id("id_f_title");						//signup & confirmation
	
	static By el_06 = By.id("id_f_label_fn");					//signup & confirmation
	static By el_07 = By.id("id_fname");						//signup & confirmation
	static By el_08 = By.id("id_f_label_ln");					//signup & confirmation
	static By el_09 = By.id("id_lname");						//signup & confirmation
	
	static By el_10 = By.id("id_f_label_ea");					//signup & confirmation
	static By el_11 = By.id("id_email");						//signup & confirmation
	
	static By el_12 = By.id("id_f_label_pn");					//signup & confirmation
	static By el_13 = By.id("id_phone");						//signup & confirmation
	
	static By el_14 = By.id("id_rb_label_g");					//signup & confirmation
	
	static By el_15 = By.id("id_rb_label_m");					//signup
	static By el_16 = By.id("id_gender_male");					//signup
	
	static By el_17 = By.id("id_rb_label_f");					//signup
	static By el_18 = By.id("id_gender_female");				//signup
	
	static By el_19 = By.id("id_f_label_s");					//signup & confirmation
	
	static By el_20 = By.id("id_state");						//signup & confirmation
	static By el_21 = By.xpath("//*[@id='id_state']/option[6]");//signup
	
	static By el_22 = By.id("id_cb_label_t");					//signup & confirmation
	static By el_23 = By.id("id_terms");						//signup & confirmation
	
	static By el_24 = By.id("id_img_facebook");					//signup
	static By el_25 = By.id("id_img_twitter");					//signup
	static By el_26 = By.id("id_img_flickr");					//signup
	static By el_27 = By.id("id_img_youtube");					//signup
	
	static By el_28 = By.id("id_reset_button");					//signup
	static By el_29 = By.id("id_submit_button");				//signup
	
	static By el_30 = By.id("timestamp");						//signup
	static By el_31 = By.id("copyright");						//signup & confirmation
	static By el_32 = By.id("os_browser");						//signup
	
	static By el_33 = By.id("ErrorLine");						//signup
	static By el_34 = By.id("fname_error");						//signup
	static By el_35 = By.id("lname_error");						//signup
	static By el_36 = By.id("email_error");						//signup
	static By el_37 = By.id("phone_error");						//signup
	
	static By el_38 = By.xpath("//*[@id='fname_error']/img");	//signup
	static By el_39 = By.xpath("//*[@id='lname_error']/img");	//signup
	static By el_40 = By.xpath("//*[@id='email_error']/img");	//signup
	static By el_41 = By.xpath("//*[@id='phone_error']/img");	//signup
	
	static By el_42 = By.id("id_gender");						//confirmation
	static By el_43 = By.id("id_back_button");					//confirmation
	
	public static void pageSignUpValidation(String url) {
		open(url);
		System.out.println("Page URL: " + driver.getCurrentUrl());
		System.out.println("UserAgent: " + (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;" ));
		
		System.out.println("01. Element [Quotes (dynamic)]: "          + (isPresent(el_01) ? "Exists" : "Not exist")); 
		System.out.println("02. Element [Current Location]: "          + (isPresent(el_02) ? "Exists" : "Not exist"));       
		System.out.println("03. Element [Weather Icon]: "              + (isPresent(el_03) ? "Exists" : "Not exist"));      
		System.out.println("04. Element [Temperature]: "               + (isPresent(el_04) ? "Exists" : "Not exist"));      
		System.out.println("05. Element [Title]: "                     + (isPresent(el_05) ? "Exists" : "Not exist")); 
		
		System.out.println("06. Element [First Name (label)]: "        + (isPresent(el_06) ? "Exists" : "Not exist"));    
		System.out.println("07. Element [First Name (field)]: "        + (isPresent(el_07) ? "Exists" : "Not exist"));       
		System.out.println("08. Element [Last Name (label)]: "         + (isPresent(el_08) ? "Exists" : "Not exist"));     
		System.out.println("09. Element [Last Name (field)]: "         + (isPresent(el_09) ? "Exists" : "Not exist"));     
		System.out.println("10. Element [Email (label)]: "             + (isPresent(el_10) ? "Exists" : "Not exist"));      
		                                                                
		System.out.println("11. Element [Email (filed)]: "             + (isPresent(el_11) ? "Exists" :"Not exist"));        
		System.out.println("12. Element [Phone (label)]: "             + (isPresent(el_12) ? "Exists" :"Not exist"));       
		System.out.println("13. Element [Phone (field)]: "             + (isPresent(el_13) ? "Exists" :"Not exist"));       
		System.out.println("14. Element [Genre (label)]: "             + (isPresent(el_14) ? "Exists" : "Not exist"));    
		System.out.println("15. Element [Male (label)]: "              + (isPresent(el_15) ? "Exists" : "Not exist"));
		
		System.out.println("16. Element [Male (radio button)]: "       + (isPresent(el_16) ? "Exists" : "Not exist"));    
		System.out.println("17. Element [Female (label)]: "            + (isPresent(el_17) ? "Exists" : "Not exist"));   
		System.out.println("18. Element [Female (radio button)]: "     + (isPresent(el_18) ? "Exists" : "Not exist")); 
		System.out.println("19. Element [State (label)]: "             + (isPresent(el_19) ? "Exists" : "Not exist"));      
		System.out.println("20. Element [State (drop-down)]: "         + (isPresent(el_20) ? "Exists" : "Not exist"));     
		                                
		System.out.println("21. Element [State California (item)]: "   + (isPresent(el_21) ? "Exists" : " Not exist ")); 
		System.out.println("22. Element [Terms (label)]: "             + (isPresent(el_22) ? "Exists" : " Not exist "));    
		System.out.println("23. Element [Terms (checkbox)]: "          + (isPresent(el_23) ? "Exists" : " Not exist "));   
		System.out.println("24. Element [Image (facebook)]: "          + (isPresent(el_24) ? "Exists" : " Not exist "));    
		System.out.println("25. Element [Image (twitter)]: "           + (isPresent(el_25) ? "Exists" : " Not exist "));    
		                
		System.out.println("26. Element [Image (flickr)]: "            + (isPresent(el_26) ? "Exists" : "Not exist"));      
		System.out.println("27. Element [Image (youtube)]: "           + (isPresent(el_27) ? "Exists" : "Not exist"));      
		System.out.println("28. Element [Reset (button)]: "            + (isPresent(el_28) ? "Exists" : "Not exist"));      
		System.out.println("29. Element [Submit (button)]: "           + (isPresent(el_29) ? "Exists" : "Not exist"));      
		System.out.println("30. Element [Timestamp (dynamic)]: "       + (isPresent(el_30) ? "Exists" : "Not exist")); 
		                                
		System.out.println("31. Element [Copyright (dynamic)]: "       + (isPresent(el_31) ? "Exists" : "Not exist")); 
		System.out.println("32. Element [OS & Browser (dynamic)]: "    + (isPresent(el_32) ? "Exists" : "Not exist")); 
		                                
		System.out.println("33. Element [Error Line]: "                + (isPresent(el_33) ? "Exists" : "Not exist"));     
		                
		System.out.println("34. Element [First Name Error]: "          + (isPresent(el_34) ? "Exists" : "Not exist"));     
		System.out.println("35. Element [Last Name Error]: "           + (isPresent(el_35) ? "Exists" : "Not exist"));      
		System.out.println("36. Element [Email Error]: "               + (isPresent(el_36) ? "Exists" : "Not exist"));      
		System.out.println("37. Element [Phone Error]: "               + (isPresent(el_37) ? "Exists" : "Not exist"));      
		 
		System.out.println("38. Element [First Name Error (img)]: "    + (isPresent(el_38) ? "Exists" : "Not exist")); 
		System.out.println("39. Element [Last Name Error (img)]: "     + (isPresent(el_39) ? "Exists" : "Not exist")); 
		System.out.println("40. Element [Email Error (img)]: "         + (isPresent(el_40) ? "Exists" : " Not exist"));    
		System.out.println("41. Element [Phone Error (img)]: "         + (isPresent(el_41) ? "Exists" : " Not exist"));		
	    
        
		System.out.println("------------- VISABILITY----------------");
		
		
		System.out.println("33. Element [Error Line]: "               + (isVisible(el_33) ? "Visible" : " Not visible"));  
		System.out.println("34. Element [First Name Error]: "         + (isVisible(el_34) ? "Visible" : " Not visible"));   
		System.out.println("35. Element [Last Name Error]: "          + (isVisible(el_35) ? "Visible" : " Not visible"));   
		System.out.println("36. Element [Email Error]: "              + (isVisible(el_36) ? "Visible" : " Not visible"));  
		System.out.println("37. Element [Phone Error]: "              + (isVisible(el_37) ? "Visible" : " Not visible"));   
		                                
		System.out.println("38. Element [First Name Error (img)]: "   + (isVisible(el_38) ? "Visible" : " Not visible"));
		System.out.println("39. Element [Last Name Error (img)]: "    + (isVisible(el_39) ? "Visible" : " Not visible")); 
		System.out.println("40. Element [Email Error (img)]: "        + (isVisible(el_40) ? "Visible" : " Not visible"));   
		System.out.println("41. Element [Phone Error (img)]: "        + (isVisible(el_41) ? "Visible" : " Not visible"));
		
		System.out.println("OS/Browser: " + driver.findElement(el_32).getText());
	
	}
	
	public static void pageConfirmationValidation(String url) {
		open(url);
		System.out.println("Page URL: " + driver.getCurrentUrl());
		System.out.println("UserAgent: " + (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;" ));
		
		System.out.println("05. Element [Title]: "                     + (isPresent(el_05) ? "Exists" : "Not exist")); 
		
		System.out.println("06. Element [First Name (label)]: "        + (isPresent(el_06) ? "Exists" : "Not exist"));    
		System.out.println("07. Element [First Name (field)]: "        + (isPresent(el_07) ? "Exists" : "Not exist"));       
		System.out.println("08. Element [Last Name (label)]: "         + (isPresent(el_08) ? "Exists" : "Not exist"));     
		System.out.println("09. Element [Last Name (field)]: "         + (isPresent(el_09) ? "Exists" : "Not exist"));     
		System.out.println("10. Element [Email (label)]: "             + (isPresent(el_10) ? "Exists" : "Not exist"));      
		                                                                
		System.out.println("11. Element [Email (filed)]: "             + (isPresent(el_11) ? "Exists" :"Not exist"));        
		System.out.println("12. Element [Phone (label)]: "             + (isPresent(el_12) ? "Exists" :"Not exist"));       
		System.out.println("13. Element [Phone (field)]: "             + (isPresent(el_13) ? "Exists" :"Not exist"));       
		System.out.println("14. Element [Genre (label)]: "             + (isPresent(el_14) ? "Exists" : "Not exist"));
		
		System.out.println("19. Element [State (label)]: "             + (isPresent(el_19) ? "Exists" : "Not exist"));      
		System.out.println("20. Element [State (drop-down)]: "         + (isPresent(el_20) ? "Exists" : "Not exist"));   
		
		System.out.println("22. Element [Terms (label)]: "             + (isPresent(el_22) ? "Exists" : " Not exist "));    
		System.out.println("23. Element [Terms (checkbox)]: "          + (isPresent(el_23) ? "Exists" : " Not exist "));
		
		System.out.println("31. Element [Copyright (dynamic)]: "       + (isPresent(el_31) ? "Exists" : "Not exist")); 
		
		System.out.println("42. Element [Gender (field)): "            + (isPresent(el_42) ? "Exists" : " Not exist")); 
		System.out.println("43. Element [Back (button)]: "             + (isPresent(el_43) ? "Exists" : " Not exist"));
		
		
		System.out.println("------------- VISABILITY----------------");
		
		System.out.println("43. Element [Back (button)]: "            + (isVisible(el_43) ? "Visible" : " Not visible")); 
		}
	
	public static void main(String[] args) {
		System.out.println("Browser: HtmlUnit");
		start = System.currentTimeMillis();
		pageSignUpValidation("http://alex.academy/exe/signup/v1/index.php");
		pageConfirmationValidation("http://alex.academy/exe/signup/v1/confirmation.php");
		
		driver.quit();
		
		finish = System.currentTimeMillis();
		System.out.println("Response time: " + (finish - start) + " ms");
		
	}
}
