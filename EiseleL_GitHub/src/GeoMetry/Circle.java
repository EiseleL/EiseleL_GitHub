package GeoMetry;

public class Circle extends Shape {

	double radius = 0;

	public Circle(double xCords, double yCords, double radius) {
		super(xCords, yCords);
		this.radius = radius;
	}
	/**
	 * Calculate Circumference from Circle
	 * @return
	 */
	public double calculateCircumference() {
		return 3.14159265359*(radius*2);
	}

	/**
	 * Calculate Area from Circle
	 * @return
	 */
	public double calculateArea() {
		return 2*radius*3.14159265359;
	}
	
	
	
}
