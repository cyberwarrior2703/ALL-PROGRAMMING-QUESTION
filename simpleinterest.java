/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;
import java.util.*;
/**
 *
 * @author ANUJ KAUSHAL
 */
public class simpleinterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double p,r,t,si;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principle=");
        p=sc.nextDouble();
         System.out.println("enter rate=");
         r=sc.nextDouble();
          System.out.println("enter time=");
        t=sc.nextDouble();
        si=((p*r*t)/100);
        System.out.println("simple interest is "+si);
    }
    
}
