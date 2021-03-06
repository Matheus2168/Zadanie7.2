public class CalculatorTest {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5,20);
        Shape circle = new Circle(10);

        System.out.printf("Pole kwadratu o bokach %.2f i %.2f wynosi %.2f, a jego obwod %.2f%n",
                rectangle.getA(),rectangle.getB(),ShapeCalculator.calculateArea(rectangle),ShapeCalculator.calculatePerimeter(rectangle));
        System.out.printf("Pole kola o promieniu %.2f wynosi %.2f, a jego obwod %.2f%n",
                circle.getR(),ShapeCalculator.calculateArea(circle),ShapeCalculator.calculatePerimeter(circle));


        Shape[] shapes = new Shape[]{rectangle,circle};
        for (Shape shape : shapes) {
            System.out.printf("Pole tego ksztaltu wynosi %.2f, a jego obwod %.2f%n",
                    ShapeCalculator.calculateArea(shape),ShapeCalculator.calculatePerimeter(shape));

        }


    }


}
