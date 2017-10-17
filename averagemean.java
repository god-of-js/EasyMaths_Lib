import java.util.Scanner;
// @author www.github.com/khelechy
// collect data(10) and find their mean

public class averagemean{
    public static void main(String argsp[]) {
        //setting int array to hold then values
        // @author khelechy

        Scanner input = new Scanner(System.in);

        int grade;
        int counter = 0;
        int total = 0;
        double average;

        //getting inputs and setting to get 10 values
        //@author khelechy

        System.out.println("Enter your values:  ");

        while (counter < 10) {
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }
        average = total/10;
        System.out.println("average(mean) is :  "+ average);
    }
}