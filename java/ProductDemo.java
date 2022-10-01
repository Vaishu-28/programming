import java.util.Scanner;
class Shape{
    public void findArea(double r){
        double area = 3.14*r*r;
        System.out.println("Area of circle: " + area);
    }
    public void findArea(int l, int b){
        int area=l*b;
        System.out.println("Area of rectangle: " + area);
    }
}

public class ShapeDemo{
    public static void main(String[] args){
        Shape s = new Shape();
        s.findArea(6.73835);
        s.findArea(3,4);
    }
}