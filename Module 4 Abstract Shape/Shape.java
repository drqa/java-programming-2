
public abstract class Shape{

    public abstract double area();

    public abstract double perimeter();

}

class Rectangle extends Shape {
    double width;
    double length;
    private double area;
    private double perimeter;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double area() {
        area =  width * length;
        return area;
    }

    public double perimeter(){
        perimeter = (width + length) * 2 ;
        return perimeter;
    }

    public String toString(){
        return "Rectangle area: " + area + "\nRectangle perimeter: " + perimeter;
    }
}

class Circle extends Shape {
    double radius;
    private double area;
    private double perimeter;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area() {
        area = Math.PI * radius * radius;
        return area;
    }

    public double perimeter(){
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public String toString(){
        return "Circle area: " + area + "\nCircle perimeter: " + perimeter;
    }
}

class Triangle extends Shape {
    double side1;   
    double side2;
    double side3;
    private double area;
    private double perimeter;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() {
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    public double perimeter(){
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public String toString(){
        return "Triangle area: " + area + "\nTriangle perimeter: " + perimeter;
    }
}


