
import java.util.Scanner;


public class Chap1_PrcSet {
    public static void main(String[] args) {
        //Question no 1
        ////Write a program to sum 3 numbers in java
        int num1= 4;
        int num2= 5;
        int num3= 6;
        int sum= num1+num2+num3;
        System.out.println("The sum of 3 numbers is: "+sum);

        //Question no 2
        //Write a program to calculate the cgpa of 5 subjects 
        float sub1= 50.0f;
        float sub2= 60.0f;
        float sub3= 70.0f;
        float sub4= 80.0f;
        float sub5= 90.0f;
        float cgpa= (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("The cgpa of 5 subjects is: "+cgpa);

        //Question no 3
        //Write a program to take a user input of name and print name with  hello (name) have a good day
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a good day");

        //Question 4
        //Wrte a java  program to convert a kilometer to miles
        double conversionFactor = 0.621371;
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * conversionFactor;
        System.out.println(kilometers + " km is equal to " + miles + " miles.");

        //Question 5
        //Write a program to detect a number whter it is int or not 
        System.out.print("Enter a number: ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        
    }
}

    

