/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;
import java.util.*;
/**
 *
 * @author ANUJ KAUSHAL
 */
public class calculator {
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,sum,sub,mul,div;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number=");
        a=sc.nextDouble();
         System.out.println("enter the second number=");
         b=sc.nextDouble();
         sum=a+b;
         sub=a-b;
         mul=a*b;
         div=a/b;
         System.out.println("sum is" + sum);
         System.out.println("subtraction is" + sub);
         System.out.println("multiplication is" + mul);
         System.out.println("division is" + div);
    }
    
}
