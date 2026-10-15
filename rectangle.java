class Rectanglearea1 {
    double length, breadth;
    double area(){
        return length*breadth;
    }
}
public class Area{
    public static void main(String[] args) {
        Rectanglearea1 A = new Rectanglearea1();
        A.length = 10;
        A.breadth = 5;
        System.out.println("area: "+ A.area());
    }
}
