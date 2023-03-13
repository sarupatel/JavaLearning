package learningOOP;

public class Rectangle {
//state
	private double length;
	private double width;
	private double area;

	// constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// behavior
	public double area() {
		this.area = length * width;
		return area;
	}

	public void setLength(double length) {
		this.length = length;
		this.area = area();
	}

	public void setWidth(double width) {
		this.width = width;
		this.area = area();
	}

	public String toString() {
		return String.format("Length - %f, Width - %f, Area - %f", length, width, area);
	}

}
