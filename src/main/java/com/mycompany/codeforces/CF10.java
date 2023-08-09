/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeforces;

import java.util.*;

public class CF10{
    
     public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        
        for(int i=0;i<t;i++){
        
           int a=inp.nextInt();
           int b=inp.nextInt();
           int c=inp.nextInt();
           
            if(a+b>=10){
                System.out.println("Yes");
                continue;
            }
            else if(a+c>=10){
                System.out.println("Yes");
                continue;
            }
            
             else if(b+c>=10){
                System.out.println("Yes");
                continue;
            }
            
             else{
                System.out.println("No");
             }
            
            
        }
    }
    
}
