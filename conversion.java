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
public class conversion {
     public static void main(String[] args) {
        // TODO code application logic here
        double c,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temp in celsius =");
        c=sc.nextDouble();
         f=(1.8*c)+32;
         System.out.println("temperature in fahrenhiet is" + f);
     }
}
