import java.util.Scanner;

/**
 * Write a description of class date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class date
{
    public static void main(String[]args){
        Scanner Q1 = new Scanner(System.in);
        System.out.println("Enter the year");
        
        String year = Q1.nextLine();  
        
        Scanner Q2 = new Scanner(System.in);
        System.out.println("Enter the month");
        
        String month = Q2.nextLine();
        
        Scanner Q3 = new Scanner(System.in);
        System.out.println("Enter the day");
        
        String day = Q3.nextLine();
        
        Scanner Q4 = new Scanner(System.in);
        System.out.println("Enter the day in a week");
        
        String weekday = Q4.nextLine();
        
        System.out.println("american format:" + weekday + ", " + month + "/" + day + "/" + year);
        System.out.println("european format:" + weekday + " " + day + "/" + month + "/" + year);
    }
}
