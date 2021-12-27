import java.util.*;

public class Calculator{
    
    static double NumberOne;  // Number input
    static double NumberTwo; //Second Number input

    
    public static String LengthChecker(double NumberOne, double NumberTwo){

        String Length = String.valueOf(NumberOne); //Lines 63 -71 converts the double into a string and checks the length of the string 
                if (Length.length() == 0){                  // if the length matches the correct length it moves forward but if its more than 1 character it will tell you
                    return "Valid Length";                             // that it is a invalid length 
                }

                else if (Length.length() > 0){
                    System.out.println("Invalid Length");
                    return "Invalid Length";
                }
                

        
    }
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

           
            
            switch(Option){
                
                //Addition Case
                case '+':
                System.out.print("Enter a number your would like to add: ");
                NumberOne = keyboard.nextDouble();

                String Length = String.valueOf(NumberOne); //Lines 63 -71 converts the double into a string and checks the length of the string 
                if (Length.length() == 0){                  // if the length matches the correct length it moves forward but if its more than 1 character it will tell you
                    continue;                               // that it is a invalid length 
                }

                else if (Length.length() > 0){
                    System.out.println("Invalid Length");
                    break;
                }
                System.out.print("Enter a second number you would like to add: ");
                NumberTwo = keyboard.nextDouble();

                String Length = String.valueOf(NumberTwo); //Lines 63 -71 converts the double into a string and checks the length of the string 
                if (Length.length() == 0){                  // if the length matches the correct length it moves forward but if its more than 1 character it will tell you
                    continue;                               // that it is a invalid length 
                }

                else if (Length.length() > 0){
                    System.out.println("Invalid Length");
                    break;
                }
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
                
                // ===============================
                //Subtraction Case
                case '-':
                System.out.print("Enter a number you would like to subtract: ");
                NumberOne = keyboard.nextDouble();
                
                String Length = String.valueOf(NumberOne);
                if (Length.length() == 0){
                    continue;
                }

                else if (Length.length() > 0){
                    System.out.println("Invalid Length");
                    break;
                }

                System.out.print("Enter a second number you like to subtract: ");
                NumberTwo = keyboard.nextDouble();

                String LengthTwo = String.valueOf(NumberTwo);
                if (Length.length() == 0){
                    continue;
                }

                else if (Length.length() > 0){
                    System.out.println("Invalid Length");
                    break;
                }
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


                //===============================
                //Multiplication Case
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
                
                //================================================================================================================
                //Division Case
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

                //==============================================================================
                //Exponential Case
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

                default:
                System.out.flush();
                System.out.println("INVALID OPTION");
                continue;
            }
            continue;

            }
        }
    }
