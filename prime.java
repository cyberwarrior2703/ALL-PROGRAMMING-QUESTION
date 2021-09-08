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
public class prime {
    public static void main(String args[])
    {
        int i,r=0,a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=2;i<=a-1;i++)
        {
            if(a%i==0)
                r=1;
            break;
        }if(r==0)
            System.out.print(a+" "+"is a prime no");
        else
             System.out.print(a+" "+"is not a prime no");
    }
}
