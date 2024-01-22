package GeoMetry;

public abstract class Shape {
	
	double xCords = 0;
	double yCords = 0;
	
	public Shape(double xCords, double yCords) {
		super();
		this.xCords = xCords;
		this.yCords = yCords;
	}

	public double getxCords() {
		return xCords;
	}

	public double getyCords() {
		return yCords;
	}

	public void setxCords(double xCords) {
		this.xCords = xCords;
	}

	public void setyCords(double yCords) {
		this.yCords = yCords;
	}
	
	public abstract double calculateCircumference();
	
	public abstract double calculateArea();
}
