package training;

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box(); 
		int area = box.areaOfBox();
		System.out.println("The area of the box is : " + area);
		area = box.areaOfBox(30,10);
		System.out.println("The area of the box is : " + area);
		box.setWidth(20);
		box.setHeight(10);
		area = box.areaOfBox();
		System.out.println("The area of the box is : " + area);
		area = box.areaOfBox(box.getWidth(), box.getHeight());
		System.out.println("The area of the box is : " + area);
		//Box box1 = new Box(25,25);
		//System.out.println("The area of the box is : " + box1.areaOfBox());
	}

}
