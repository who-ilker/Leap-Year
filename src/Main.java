import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        int year;
        System.out.print("Enter year: ");
        year = inp.nextInt();

        if (year % 100 == 0){
            if (year % 400 == 0)
                System.out.println("The year you entered is the leap year.");
            else
                System.out.println("That is not a leap year!");
        }
        else if (year % 4 == 0){
            System.out.println("The year you entered is the leap year.");
        }
        else
            System.out.println("That is not a leap year!");

    }
}