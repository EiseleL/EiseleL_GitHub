package GeoMetry;

public class Rectangle extends Shape {

	double length = 0;
	double with = 0;
	
	public Rectangle(double xCords, double yCords, double length, double with) {
		super(xCords, yCords);
		this.length = length;
		this.with = with;
	}

	/**
	 * Calculate Circumference from Rectangle
	 * @return
	 */
	public double calculateCircumference() {
		return (length + with)*2;
	}

	/**
	 * Calculate Area from Rectangle
	 * @return
	 */
	public double calculateArea() {
		return length*with;
	}
	

	
}
