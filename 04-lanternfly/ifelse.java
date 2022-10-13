import java.util.Scanner;

/**
 * Write a description of class ifelse here.
 *
 * @author (your name) david tian
 * @version (a version number or a date)
 */
public class ifelse
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you know people like to decress there sleep time ");
        System.out.println("to do other thing like play game or watch video.");
        
        System.out.print("How long did you sleep yestday?");
        int num = input.nextInt();
        
        if (num<7){
            System.out.println("you need sleep longer to got health!");
        }
        if (num>12){
            System.out.println("you sleep to mach, you shoud got more active!");
        }
        else{
            System.out.println("look like you sleep really good yestday!");
        }
        
        System.out.println("baybay!");
        }
        
    }
