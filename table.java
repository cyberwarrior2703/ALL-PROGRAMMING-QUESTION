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
public class table {
    public static void main(String[] args) {
        // TODO code application logic here
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value =");
        n=sc.nextInt();
         for(i=1;i<=10;i++)
         {
         System.out.println(n+"*"+i+"="+i*n);
     }}
}
