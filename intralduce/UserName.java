
import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String number = s.nextLine();
    System.out.print("Are you a student or teacher: ");
    String who = s.nextLine();
    
    if(who.equals("student")){
        System.out.println("You email is: " + firstName.toLowerCase() + initialize(lastName.toLowerCase()) + number + "@nycstudents.net");
    }
    else{
        System.out.println("you email is:  " + initialize(firstName.toLowerCase()) + lastName.toLowerCase() + number + "@school.nyc.gov"); 
    }
    s.close();
  } 
  public static String initialize(String n) {
    return n.substring(0, 1);
  } 

} 