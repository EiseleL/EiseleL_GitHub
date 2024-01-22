package GeoMetry;

public class Triangle extends Shape{

	double length = 0;
	double height = 0;
	
	public Triangle(double xCords, double yCords, double length, double height) {
		super(xCords, yCords);
		this.height = height;
		this.length = length;
		}
	
	/**
	 * Calculate Circumference from Triangle
	 * @return
	 */
	public  double calculateCircumference() {
		return length*3;
	}

	/**
	 * Calculate Area from Triangle
	 * @return
	 */
	public double calculateArea() {
		return 0.5*height * length;
	}
	
	
	
}
