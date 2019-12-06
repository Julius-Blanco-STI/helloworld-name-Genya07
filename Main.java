package main;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Hello World");
    
    System.out.println("What is your name?");
        String VarName = Obj.nextLine();
    System.out.println("What is your address?");
        String VarAdd = Obj.nextLine();
    System.out.println("What is your age?");
        int VarAge = Obj.nextInt();
    
        
    System.out.println("Hi " + VarName +"!");
    System.out.println("Your age is " + VarAge);
    System.out.println("You live at" + VarAdd);
    
    }
    
}
