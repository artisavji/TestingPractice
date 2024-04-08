package Variables;
 //static variables assignment
public class MathUtils {

    public static final double PI=  3.14;
     public static double Calculatecircumference(double radius )
     {
return  2*PI*radius;
     }

    public static void main(String[] args) {
        double radius=3.0;
        double circumference=Calculatecircumference(radius);
        System.out.println(" circumference of circle with radius is : "+circumference);
    }
}
