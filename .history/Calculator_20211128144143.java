import java.lang.StackWalker.Option;
import java.util.*;
public class Calculator{
    
    


    public static void main(String[] args){
    
    double InputNumberOne; // The first number you input that you would like multiply,divide, subtract, add, or exponential
    double InputNumberTwo; // The second number you input that you would like multiply,divide, subtract, add, or exponential
    char Option;           // operator option variable 
    boolean Counter = true;  //Counter for the while loop
        
        while(true){
            
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What would you like to \n1.) Addition (+) \n2.) Subtraction (-) \n3.) Multiplication (*) \n4.) Division (/) \n5.) Exponential (^) \nOPTION MUST BE A OPERATOR  \nWhat option would like to choose: ");
            Option = keyboard.next().charAt(0);

            switch(Option){
                
                case '+':
                System.out.println("Enter a number your would like to add: ");
                InputNumberOne = keyboard.nextDouble();
                System.out.println("Enter a second number you would like to add: ");
                
                sum = 
            }

            }
        }
    }
