/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.util.Scanner;

/**
 *
 * @author ANUJ KAUSHAL
 */
public class swapping {
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value =");
        a=sc.nextInt();
         b=sc.nextInt();
         c=a;
         a=b;
         b=c;
          System.out.println("value of a is" + a);
         System.out.println("value of b is" + b);
     }
}
