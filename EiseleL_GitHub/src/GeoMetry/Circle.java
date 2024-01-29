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
		return Math.PI*(radius*2);
	}

	/**
	 * Calculate Area from Circle
	 * @return
	 */
	public double calculateArea() {
		return Math.PI*(radius*radius);
	}
	
	
	
}
