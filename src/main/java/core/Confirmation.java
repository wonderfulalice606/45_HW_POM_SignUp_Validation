package core;

import org.openqa.selenium.WebDriver;

public class Confirmation {
	
public static void validate(WebDriver driver, String url) {
		
		Common.open(url);
		
		Common.pageValidation("05. Element [Title]: ", Common.el_05);
		
		Common.pageValidation("06. Element [First Name (label)]: ", Common.el_06);
		Common.pageValidation("07. Element [First Name (field)]: ", Common.el_07);
		Common.pageValidation("08. Element [Last Name (label)]: ", Common.el_08);
		Common.pageValidation("09. Element [Last Name (field)]: ", Common.el_09);
		Common.pageValidation("10. Element [Email (label)]: ", Common.el_10);
		
		Common.pageValidation("11. Element [Email (filed)]: ", Common.el_11);
		Common.pageValidation("12. Element [Phone (label)]: ", Common.el_12);
		Common.pageValidation("13. Element [Phone (field)]: ", Common.el_13);
		Common.pageValidation("14. Element [Genre (label)]: ", Common.el_14);
		
		Common.pageValidation("19. Element [State (label)]: ", Common.el_19);
		Common.pageValidation("20. Element [State (drop-down)]: ", Common.el_20);
		
		Common.pageValidation("22. Element [Terms (label)]: ", Common.el_22);
		Common.pageValidation("23. Element [Terms (checkbox)]: ", Common.el_23);
		
		Common.pageValidation("31. Element [Copyright (dynamic)]: ", Common.el_31);
		
		Common.pageValidation("42. Element [Gender (field)): ", Common.el_42);
		Common.pageValidation("43. Element [Back (button)]: ", Common.el_43);
		
}

}
