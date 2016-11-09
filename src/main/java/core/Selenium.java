package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
	
	public static void main(String[] args) {

//		System.out.println(args[0]);
//		System.out.println("");
//		
//		sayName("Artur", 27);
//		System.out.println("");
//		
//		String str = "Artur Sentsov Age 28 Hello World!"; // вот это одна коробка которая называется str внутри которой есть текст "Artur Sentsov Age 28 Hello World!"
//		System.out.println("str: " + str);
//		System.out.println("");
//		
//		String stores[] = new String[5]; // вот это другая коробка которая называется stores внутри которой есть другие пять коробок от 0 - 5
//		stores[0] = "Walmart";
//		stores[1] = "Costco";
//		stores[2] = "Frys";
//		System.out.println("stores[0]: " + stores[0]);
//		System.out.println("stores[1]: " + stores[1]);
//		System.out.println("");
		
		if (args.length == 0) {
			System.err.println("No arguments");
		}
		
		WebDriver driver = new FirefoxDriver();

		// String url = "http://www.learn2test.net";
		// String title_expected = "learn2test.net1";

		for (int i = 0; i < args.length; i++) {
			String text_case_id = "TC -001.0" + (i + 1);
			
			String param[] = args[0].split("\\|");
			String url = param[0];
			String title_expected = param[1];

			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			String title_actual = driver.getTitle();

			if (title_expected.equals(title_actual)) {
				System.out.println("Test Case ID: \t\t" + text_case_id);
				System.out.println("URL: \t\t\t" + url);
				System.out.println("Title Expected: \t" + title_expected);
				System.out.println("Title Actual: \t\t" + title_actual);
				System.out.println("Test Case Result: \t" + "PASSED");
			} else {
				System.out.println("Test Case ID: \t\t" + text_case_id);
				System.out.println("URL: \t\t\t" + url);
				System.out.println("Title Expected: \t" + title_expected);
				System.out.println("Title Actual: \t\t" + title_actual);
				System.out.println("Test Case Result: \t" + "FAILED");
			}
		}

		driver.close();
	}
	
	public static void sayName(String name, int age){
		System.out.println(name);
		System.out.println(age);
	}
	
	
}
