// area of a circle
// @author www.github.com/khelechy
import java.util.Scanner;

public class areaofcircle {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        int r = 0;
        int rsqr;
        double x;
        double pi = 3.142;

        //getting input from user
        //@author khelechy

        System.out.println("Enter value for radius:  ");
        r = input.nextInt();
        rsqr = r*r;
        x = rsqr * pi;
        System.out.println("The area of the circle is: "+ x);
        

    }
}