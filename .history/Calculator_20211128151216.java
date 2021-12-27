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

    public static double Division(double NumberOne, double NumberTwo){

        return NumberOne / NumberTwo;
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

            switch(Option){
                
                case '+':
                System.out.print("Enter a number your would like to add: ");
                NumberOne = keyboard.nextDouble();
                System.out.print("Enter a second number you would like to add: ");
                NumberTwo = keyboard.nextDouble();
                SystemAddition(NumberOne, NumberTwo);
                break;

                case '-':
                System.out.print("Enter a number you would like to subtract: ");
                NumberOne = keyboard.nextDouble();
                System.out.print("Enter a second number you like to subtract: ");
                NumberTwo = keyboard.nextDouble();
                Subtraction(NumberOne, NumberTwo);
                break;

                case '*':
                System.out.print("Enter a number you like to Multiply: ");
                NumberOne = keyboard.nextDouble();
                System.out.print("Enter a second number you like to Multiply: ");
                NumberTwo = keyboard.nextDouble();
                Multiply(NumberOne, NumberTwo);
                break;

                case '/':
                System.out.print("Enter a number you like to divide: ");
                NumberOne = keyboard.nextDouble();
                System.out.print("Enter a second number you you like to divide: ");
                NumberTwo = keyboard.nextDouble();
                Division(NumberOne, NumberTwo);

                case '^':
                System.out.print("Enter a number you like to be your base: ");
                NumberOne = keyboard.nextDouble();
                System.out.print("Enter a second number that you would to be your exponent: ");
                NumberTwo = keyboard.nextDouble();
                Exponential(NumberOne, NumberTwo);
                break;
            }

            break;

            }
        }
    }
