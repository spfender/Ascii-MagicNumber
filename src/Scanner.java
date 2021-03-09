import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please enter your name: ");

    String userName = myObj.nextLine(); 
    System.out.println("Hello" + userName);
    System.out.println("Would you like to continue the interactive portion? (Press Y");
    String answer = myObj.nextLine();  
           
    if (answer.equals("y")) {
    
        System.out.println("questiosn here.");
       
        }
    else 
    {
        System.out.println("The application will quit now.");
    }
 
    
   
  }
}
