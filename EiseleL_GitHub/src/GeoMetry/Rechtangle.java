package GeoMetry;

public class Rechtangle extends Shape {

	double length = 0;
	double with = 0;
	
	public Rechtangle(double xCords, double yCords, double length, double with) {
		super(xCords, yCords);
		this.length = length;
		this.with = with;
	}

	@Override
	public double calculateCircumference() {
		return (length + with)*2;
	}

	@Override
	public double calculateArea() {
		return length*with;
	}
	
	
	
}
