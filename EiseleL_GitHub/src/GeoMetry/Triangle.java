package GeoMetry;

public class Triangle extends Shape{

	private double length;
	private double height;
	
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
