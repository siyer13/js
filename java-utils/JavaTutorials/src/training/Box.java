package training;

//POJO : Plain Old Java Objects

public class Box {
	
	private int width;
	private int height;
	
	public int areaOfBox() {
		return width * height;
	}
	
	public int areaOfBox(int width, int height) {
		return width * height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Box(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Box() {
		
	}
}
