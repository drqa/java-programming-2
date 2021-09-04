public class ShapeTest {
    
    public static void main(String[] args) {
        Shape shapeArray[] = new Shape[3];

        Rectangle rect = new Rectangle(5, 10);
        Triangle tri = new Triangle(5, 10, 10);
        Circle circle = new Circle(10);

        shapeArray[0] = rect;
        shapeArray[1] = tri;
        shapeArray[2] = circle;

        System.out.println();

        for(int i = 0; i <= 2; i++){
            shapeArray[i].area();
            shapeArray[i].perimeter();
            System.out.println(shapeArray[i].toString());
        }
    }
}
