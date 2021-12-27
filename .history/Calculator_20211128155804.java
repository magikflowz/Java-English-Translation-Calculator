import java.lang.StackWalker.Option;
import java.util.*;
public class Calculator{
    
    static double NumberOne;  // Number input
    static double NumberTwo; //Second Number input

    public static double Addition(double NumberOne, double NumberTwo){

        return NumberOne + NumberTwo;
    }

    public static double Subtraction(double NumberOne, double NumberTwo){

        return NumberOne - NumberTwo;
    }

    public static double Multiply(double NumberOne, double NumberTwo){

        return NumberOne * NumberTwo;
    }

    public static Integer Division(Integer intNumberOne, Integer intNumberTwo){

        try {
            double result = NumberOne/NumberTwo;
            if(NumberTwo == 0)
                throw new ArithmeticException("sorry bud, we don't accept 0 divisors.");
        }

        finally{            
        }
        return intNumberOne/intNumberTwo;
    }

    public static double Exponential(double NumberOne, double NumberTwo){

        return Math.pow(NumberOne, NumberTwo);
    }

    public static void main(String[] args){

    char Option;           // operator option variable 
    boolean Counter = true;  //Counter for the while loop
        
        while(Counter){
            
            Scanner keyboard = new Scanner(System.in);
            System.out.print("What would you like to \n1.) Addition (+) \n2.) Subtraction (-) \n3.) Multiplication (*) \n4.) Division (/) \n5.) Exponential (^) \nOPTION MUST BE A OPERATOR  \nWhat option would like to choose: ");
            Option = keyboard.next().charAt(0);

            if (option.equals('+'))

            switch(Option){
                
                case '+':
                System.out.print("Enter a number your would like to add: ");
                NumberOne = keyboard.nextDouble();
                System.out.print("Enter a second number you would like to add: ");
                NumberTwo = keyboard.nextDouble();
                System.out.println("Sum is " + Addition(NumberOne, NumberTwo));
                keyboard.nextLine();
                
                while(true){
                System.out.print("Would you like to perform another operation y or n: ");
                String Continue = keyboard.nextLine();

                if (Continue.equals("y")){
                    break;
                }

                if (Continue.equals("n")){
                    System.out.print("Exiting program...");
                    System.exit(0);
                }

                else{
                    System.out.println("Invalid Option");
                    continue;
                }
                }
                break;

                case '-':
                System.out.print("Enter a number you would like to subtract: ");
                NumberOne = keyboard.nextDouble();
                System.out.print("Enter a second number you like to subtract: ");
                NumberTwo = keyboard.nextDouble();
                System.out.print("Sum is "+ Subtraction(NumberOne, NumberTwo));
                keyboard.nextLine();
                
                while(true){
                System.out.print("Would you like to perform another operation y or n: ");
                String Continue = keyboard.nextLine();

                if (Continue.equals("y")){
                    break;
                }

                if (Continue.equals("n")){
                    System.out.print("Exiting program...");
                    System.exit(0);
                }

                else{
                    System.out.println("Invalid Option");
                    continue;
                }
                }
                break;
                
                case '*':
                System.out.print("Enter a number you like to Multiply: ");
                NumberOne = keyboard.nextDouble();
                System.out.print("Enter a second number you like to Multiply: ");
                NumberTwo = keyboard.nextDouble();
                System.out.print("Sum is" + Multiply(NumberOne, NumberTwo));
                keyboard.nextLine();
                
                while(true){
                System.out.print("Would you like to perform another operation y or n: ");
                String Continue = keyboard.nextLine();

                if (Continue.equals("y")){
                    break;
                }

                if (Continue.equals("n")){
                    System.out.print("Exiting program...");
                    System.exit(0);
                }

                else{
                    System.out.println("Invalid Option");
                    continue;
                }
                }
                break;

                case '/':
                System.out.print("Enter a number you like to divide: ");
                Integer intNumberOne = keyboard.nextInt();
                System.out.print("Enter a second number you you like to divide: ");
                Integer intNumberTwo = keyboard.nextInt();
                System.out.print("Sum is" + Division(intNumberOne, intNumberTwo));
                keyboard.nextLine();
                
                while(true){
                System.out.print("Would you like to perform another operation y or n: ");
                String Continue = keyboard.nextLine();

                if (Continue.equals("y")){
                    break;
                }

                if (Continue.equals("n")){
                    System.out.print("Exiting program...");
                    System.exit(0);
                }

                else{
                    System.out.println("Invalid Option");
                    continue;
                }
                }
                break;

                case '^':
                System.out.print("Enter a number you like to be your base: ");
                double NumberOne = keyboard.nextDouble();
                System.out.print("Enter a second number that you would to be your exponent: ");
                NumberTwo = keyboard.nextDouble();
                System.out.print("Sum is" + Exponential(NumberOne, NumberTwo));
                keyboard.nextLine();
                
                while(true){
                System.out.print("Would you like to perform another operation y or n: ");
                String Continue = keyboard.nextLine();

                if (Continue.equals("y")){
                    break;
                }

                if (Continue.equals("n")){
                    System.out.print("Exiting program...");
                    System.exit(0);
                }

                else{
                    System.out.println("Invalid Option");
                    continue;
                }
                }
                break;
            }
            continue;

            }
        }
    }
