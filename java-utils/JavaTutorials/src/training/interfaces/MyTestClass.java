package training.interfaces;

public class MyTestClass {

	public static void main(String[] args) {
		WebDriver driver = new FireFoxDriver();
	
		driver.login();
		System.out.println("Maximized window size: " + driver.maximizeWindow());
		
		driver = new ChromeDriver();
		driver.login();
		System.out.println("Maximized window size: " + driver.maximizeWindow());

	}

}
