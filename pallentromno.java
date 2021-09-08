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
public class pallentromno {
    public static void main(String args[]){
       int n,r=0,rem,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       i=n;
       while(n!=0)
       {
           rem=n%10;
           r=r*10+rem;
           n=n/10;
       }
       if(i==r)
           System.out.print(r+" "+"is a pallentrom no");
       else
           System.out.print(r+" "+"is a not a pallentrom no");
    }
}
