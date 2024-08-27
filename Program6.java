import java.util.Scanner; 
public class Program6 {
    public static void main (String[] args ){
     Scanner myScanner = new Scanner (System.in);
     final double pi = 3.14159;
     double radius = 0.0;
     System.out.println("Please enter the radius:"); 
     radius = myScanner.nextDouble();
     
     double diameter = radius*2;
     double area = pi*radius*radius; 
     double circumfrence = 2*(pi)*(radius); 
     
     diameter =  (diameter)*1000; 
     diameter = (int) (diameter + 0.5); 
     diameter = (double) (diameter)/1000; 
     
     area = area*1000;
     area = (int) (area + 0.5);
     area = (double) (area)/1000; 
     
     System.out.println("The diameter of the circle = " + diameter);
     System.out.println("The area of the cirlce = " + area);
     System.out.println("The circumfrence of the circle = " + circumfrence);
    }
}
