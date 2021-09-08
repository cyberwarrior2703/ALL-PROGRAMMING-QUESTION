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
public class greatestno {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.print(a+"is greater");
            
        }
        if(b>a && b>c)
        {
            System.out.print(b+"is greater");
        }if(c>a && c>b)
        {
            System.out.print(c+"is greater");
        }
    }
}
