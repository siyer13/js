package training.interfaces;

public class FireFoxDriver implements WebDriver {

	@Override
	public void login() {
		System.out.println("Firefox Implementation of webdriver");

	}

	@Override
	public int maximizeWindow() {
		int SIZE = 100;
		return SIZE;
	}

}
