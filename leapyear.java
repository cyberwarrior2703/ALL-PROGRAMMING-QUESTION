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
public class leapyear {
    public static void main(String args[]){
       int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       if(n%4==0)
       {
           System.out.print("leap year");
       }
       else
       {
           System.out.print("normal year");
       }
    }
}
