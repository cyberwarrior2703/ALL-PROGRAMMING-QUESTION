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
public class reversing {
    public static void main(String[] args) {
        // TODO code application logic here
        int n,a,r=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value =");
        n=sc.nextInt();
        while(n>=1)
        {
        a=n%10;
        r=r*10+a;
        n=n/10;
        }
        
         System.out.println("reverse no is" + r);
     }
}
