import java.util.Scanner;

/**
 * Write a description of class incometax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class incometax
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter annual income:");
    double income = sc.nextDouble();
    double tax=0;
    if(income<=500000){
    tax = income * 0.01;
    }
    else if(income<=700000){
    tax=5000 + (income-500000)*0.1;
    }
    else if(income<=1000000){
    tax=15000 + (income-700000)*0.2;
    }
    else if(income<=200000){
    tax=35000+(income-1000000)*0.3;
    }
    else if(income<=5000000){
    tax=335000 + (income-2000000)*0.36;
    }
    else{
    tax=1135000 + (income-5000000)*0.39;
    }
    System.out.println(tax);
    
    }
}