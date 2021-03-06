import java.util.*;

public class Calculator{
    
    static int  NumberOne;  // Number input
    static int NumberTwo; //Second Number input
    public static Scanner keyboard = new Scanner(System.in);
    static String Continue;
    public static String EnglishConversion[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    
    public static String LengthChecker(int NumberOne, int NumberTwo){ //Length Checker method takes variables NumberOne and NumberTwo as arguments

        String Length = String.valueOf(NumberOne); //Converts the int NumberOne and NumberTwo into Strings 
        int strLength = Length.length();

        String Length2 = String.valueOf(NumberTwo); 
        int strLength2 = Length2.length();

        if (strLength > 1 || strLength2 > 1){ //if either lengths are greater than 0 then it returns invalid lengths  
            return "Invalid Length";
        }

        else{
            return "Valid Length";
        }
        
    }
   
    public static void main(String[] args){

    char Option;           // operator option variable 
    boolean Counter = true;  //Counter for the while loop
        
        while(Counter){  //This while loop keeps the program running and doesn't break till enters q for Option
            

            
            
            // Line 51 displays the menu 
            System.out.print("What would you like to \n1.) Addition (+) \n2.) Subtraction (-) \n3.) Multiplication (*) \n4.) Division (/) \n5.) Exponential (^) \nOPTION MUST BE A OPERATOR  \nWhat option would like to choose: ");
            Option = keyboard.next().charAt(0); //The user enters a option here and goes into the case switches for each option 

            if (Option == 'q'){
                System.out.print("Exiting program...");
                System.exit(0);
            }

            switch(Option){ //switch case option 
                
                //Addition Case
                case '+':
                System.out.print("Enter a number from 0-9 your would like to add: ");
                NumberOne = keyboard.nextInt();
                System.out.print("Enter a second number from 0-9 you would like to add: ");
                NumberTwo = keyboard.nextInt();

                if (LengthChecker(NumberOne, NumberTwo).equals("Valid Length")){ //This line validates the NumberOne and NumberTwo length to see if it meets the length requirement 
                    ;
                }

                else{
                    System.out.println("Invalid Length Number Length only enter single digit numbers"); // if it doesn't it displays this message 
                    break;
                }

                //passes the number variables into englishConversion array and converts them into a message based of the array list 
                System.out.println(EnglishConversion[NumberOne]+" plus "+EnglishConversion[NumberTwo] + " Sum is " + (NumberOne+NumberTwo));
                keyboard.nextLine();
                
                //This while loop is used to check if the user wants to continue based user input
                while(true){
                System.out.print("Would you like to perform another operation y or n: ");
                Continue = keyboard.nextLine(); //Takes user input

                if (Continue.equals("y")){ //yes condition 
                    break; //breaks out of the while loop
                }

                if (Continue.equals("n")){ //no condition 
                    System.out.print("Exiting program...");
                    System.exit(0);
                }

                else{
                    System.out.println("Invalid Option"); //prints out on screen when user didn't input y or n 
                    continue; //continues the while loop when there is a invalid option 
                }
                }
                break;
                
                // ===============================
                //Subtraction Case
                //uses the same code as above but instead it is subtraction 
                case '-':
                System.out.print("Enter a number from 0-9 you would like to subtract: ");
                NumberOne = keyboard.nextInt();
                System.out.print("Enter a second number from 0-9 you like to subtract: ");
                NumberTwo = keyboard.nextInt();

                //Inputing NumberOne and NumberTwo and then passing into the length checker and makes sure the length meets the requirements 
                if (LengthChecker(NumberOne, NumberTwo).equals("Valid Length")){
                    ;
                }

                else{
                    System.out.println("Invalid Length Number Length only enter single digit numbers");
                    break;
                }

                //passes the number variables into englishConversion array and converts them into a message based of the array list Subtracts Numberone by NumberTwo
                System.out.println(EnglishConversion[NumberOne]+" minus "+EnglishConversion[NumberTwo] + " equals " + (NumberOne-NumberTwo));
                
                keyboard.nextLine();
                
                while(true){
                System.out.print("Would you like to perform another operation yes = y / no = n y or n: ");
                Continue = keyboard.nextLine();

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
                //uses the same code as above 
                case '*':
                System.out.print("Enter a number from 0-9 you like to Multiply: ");
                NumberOne = keyboard.nextInt();
                System.out.print("Enter a second number from 0-9 you like to Multiply: ");
                NumberTwo = keyboard.nextInt();

                //Inputing NumberOne and NumberTwo and then passing into the length checker and makes sure the length meets the requirements 
                if (LengthChecker(NumberOne, NumberTwo).equals("Valid Length")){
                    ;
                }

                else{
                    System.out.println("Invalid Length Number Length only enter single digit numbers");
                    break;
                }

                //passes the number variables into englishConversion array and converts them into a message based of the array list multiplies NUmberOne by NumberTWo
                System.out.println(EnglishConversion[NumberOne]+" multiply by "+EnglishConversion[NumberTwo] + " equals " + (NumberOne*NumberTwo));
                keyboard.nextLine();
                
                while(true){
                System.out.print("Would you like to perform another operation yes = y / no = n y or n: ");
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
                //uses the same code 
                case '/':
                System.out.print("Enter a number from 0-9 you like to divide: ");
                NumberOne = keyboard.nextInt(); // Division requires integer so I use to integers here
                System.out.print("Enter a second number from 0-9 you like to divide: ");
                NumberTwo = keyboard.nextInt();

                //passes the number variables into englishConversion array and converts them into a message based of the array list 
                if (LengthChecker(NumberOne, NumberTwo).equals("Valid Length")){
                    ;
                }

                else{
                    System.out.println("Invalid Length Number Length only enter single digit numbers");
                    break;
                }

                if (NumberTwo == 0){
                    System.out.println("Can't divide by Zero");
                    break;
                }

                 //passes the number variables into englishConversion array and converts them into a message based of the array list and divides NumberOne by NumberTwo 
                System.out.println(EnglishConversion[NumberOne]+" divided by "+EnglishConversion[NumberTwo] + " equals " + (NumberOne/NumberTwo));
                keyboard.nextLine();
                

                while(true){
                System.out.print("Would you like to perform another operation yes = y / no = n y or n: ");
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
                System.out.print("Enter a number from 0-9 you like to be your base: ");
                NumberOne = keyboard.nextInt();
                System.out.print("Enter a second number from 0-9 that you would to be your exponent: ");
                NumberTwo = keyboard.nextInt();

                //passes the number variables into englishConversion array and converts them into a message based of the array list 
                if (LengthChecker(NumberOne, NumberTwo).equals("Valid Length")){
                    ;
                }

                else{
                    System.out.println("Invalid Length Number Length only enter single digit numbers");
                    break;
                }
                //passes the number variables into englishConversion array and converts them into a message based of the array list 
                System.out.println(EnglishConversion[NumberOne]+" to the power of "+EnglishConversion[NumberTwo] + " is " + Math.pow(NumberOne, NumberTwo));
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