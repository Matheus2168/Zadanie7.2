public class ShapeCalculator {

    private static double calculateArea(Rectangle r ){ return r.getA()*r.getB(); }

    private static double calculateArea(Circle c){
        return Math.PI*Math.pow(c.getR(),2);
    }

    private static double calculatePerimeter(Rectangle r){
        return r.getA()*2+r.getB()*2;
    }

    private static double calculatePerimeter(Circle c){ return 2*Math.PI*c.getR(); }


    public static double calculateArea(Shape shape){
        double result;
        if (shape instanceof Rectangle){
            Rectangle r = (Rectangle)shape;
            result = calculateArea(r);
        }
        else if (shape instanceof Circle){
            Circle c = (Circle)shape;
            result = calculateArea(c);
        }
        else{
            result = 0;
        }
        return result;
    }

    public static double calculatePerimeter(Shape shape){
        double result;
        if (shape instanceof Rectangle){
            Rectangle r = (Rectangle)shape;
            result = calculatePerimeter(r);
        }
        else if (shape instanceof Circle){
            Circle c = (Circle)shape;
            result = calculatePerimeter(c);
        }
        else{
            result = 0;
        }
        return result;
    }



}
