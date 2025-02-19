
public class Circle implements GeometricObject{
protected double radius;

Circle(double radius){
	this.radius = radius;
}

public double getPerimeter() {
	return 2 * Math.PI * this.radius;
}

public double getArea() {
	return Math.PI * Math.pow(radius, 2);
}

public String toString() {
	return "Circle[radius=" + this.radius + "]";
}

}
