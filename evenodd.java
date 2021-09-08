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
public class evenodd {
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.print(a+"is an even no");
        }
        else
            System.out.print(a+"is a odd no");
    }
    
}
