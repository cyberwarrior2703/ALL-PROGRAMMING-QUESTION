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
public class percentage {
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c,d,e,sum,per;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks =");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=sc.nextDouble();
        e=sc.nextDouble();
       sum=a+b+c+d+e;
        per=((sum*100)/500);
         System.out.println("percentage is" + per+"%");
     }
}
