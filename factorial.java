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
public class factorial {
    public static void main(String args[]){
        int i,n,fact=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            fact=fact*i;
            
        }
     System.out.print("factorial is"+" "+fact);
    
    }
}
