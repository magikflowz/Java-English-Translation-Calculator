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

    public static void main(String[] args){

    char Option;           // operator option variable 
    boolean Counter = true;  //Counter for the while loop
        
        while(true){
            
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What would you like to \n1.) Addition (+) \n2.) Subtraction (-) \n3.) Multiplication (*) \n4.) Division (/) \n5.) Exponential (^) \nOPTION MUST BE A OPERATOR  \nWhat option would like to choose: ");
            Option = keyboard.next().charAt(0);

            switch(Option){
                
                case '+':
                System.out.println("Enter a number your would like to add: ");
                NumberOne = keyboard.nextDouble();
                System.out.println("Enter a second number you would like to add: ");
                NumberTwo = keyboard.nextDouble();
                Addition(NumberOne, NumberTwo);
                break;



                case '-':
            }

            break;

            }
        }
    }
