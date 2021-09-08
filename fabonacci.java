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
public class fabonacci {
     public static void main(String args[]){
        int a=0,b=1,c=0,i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       for(i=0;i<=n;i++)
       {
           System.out.println(a+"");
           c=a+b;
           a=b;
           b=c;
       }
    }
    
}
