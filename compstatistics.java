// this is a computed combined solution to statistics
// @author www.github.com/khelechy

import java.util.*;

public class compstatistics {


public static void main(String[] args) 
{
    // declaring integers
    //@author khelechy

    Double num1, num2, num3, num4, num5, sum, avg, max, min;

    //getting user input
    //@author khelechy

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the first number:");
    num1 = keyboard.nextDouble();
    System.out.println("Enter the seond number:");
    num2 = keyboard.nextDouble();
    System.out.println("Enter the third number:");
    num3 = keyboard.nextDouble();
    System.out.println("Enter the fourth number:");
    num4 = keyboard.nextDouble();
    System.out.println("Enter the fifth number:");
    num5 = keyboard.nextDouble();
    keyboard.close();

    double[] num = new double[5]; // array named num is declared with 5 variables
    num[0] = num1;
    num[1] = num2;
    num[2] = num3;
    num[3] = num4;
    num[4] = num5;
    Arrays.sort(num);

    double[] data = {num1, num2, num3, num4, num5};
    int mode = 0;
    int[] index = new int[999];
    int maximum = Integer.MIN_VALUE;

    for (int i = 0; i < data.length; i++){
        index[(int) data[i]]++;
    }
    for (int i = 0; i < index.length; i++){
        if(maximum < index[i]){
            maximum = index[i];
            mode = i;
        }
    }

    sum = (double)(num1 + num2 + num3 + num4 + num5);
    avg = (double)(sum/5);
    max = Math.max(Math.max(Math.max(Math.max(num1, num2),num3),num4),num5);
    min = Math.min(Math.min(Math.min(Math.min(num1, num2),num3),num4),num5);

    System.out.println("Sum:" + sum);
    System.out.println("Avg:" + avg);
    System.out.println("Max:" + max);
    System.out.println("Min:" + min);
    System.out.println("Median:" + num[2]);
    System.out.println("Mode:" + mode);
    }
}