public class ShapeCalculator {

    public static double calculateArea(Rectangle r ){
        return r.getA()*r.getB();
    }

    public static double calculateArea(Circle c){
        return Math.PI*Math.pow(c.getR(),2);
    }

    public static double calculatePerimeter(Rectangle r){
        return r.getA()*2+r.getB()*2;
    }

    public static double calculatePerimeter(Circle c){
        return 2*Math.PI*c.getR();
    }
}
