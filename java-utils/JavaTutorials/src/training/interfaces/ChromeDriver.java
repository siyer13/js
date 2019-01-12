package training.interfaces;

public class ChromeDriver implements WebDriver {

	@Override
	public void login() {
		System.out.println("Chrome Implementation of webdriver");
	}

	@Override
	public int maximizeWindow() {
		int SIZE = 50;
		return SIZE;
	}
}
