package learningOOP;

public class RectangleRunner {
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(23.0, 15.0);

		System.out.println(rectangle);
		rectangle.area();
		System.out.println(rectangle);
		rectangle.setLength(45.0);
		System.out.println(rectangle);
		rectangle.setWidth(10.0);
		System.out.println(rectangle);

	}

}
