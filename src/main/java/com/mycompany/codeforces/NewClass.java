/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeforces;


import java.util.*;
public class NewClass{
    
    public static void main(String args[]){
        
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        inp.nextLine();
        
        for(int i=0;i<t;i++){
        
        
            String s=inp.nextLine();
            String s1=inp.nextLine();
            
            String p[] = s.split(" ");
            
             int num1 = Integer.parseInt(p[1]);
             int count=0;
             for(int j=0;j<s1.length();j++){
             
                int num2=Character.getNumericValue(s1.charAt(j));  
                 
                 if(num1>num2){
                 
                 
                    String news= Integer.toString(num1);
                    
                    StringBuilder sb = new StringBuilder(s1);
                    sb.insert(j, p[1].charAt(0));
                    System.out.println(sb);
                    count++;
                    
                    break;
                 
                 }
             
             }
             if(count==0){
             
                    StringBuilder sb = new StringBuilder(s1);
                    sb.insert(s1.length(), p[1].charAt(0));
                    System.out.println(sb);
             
             }
             
             
        
        }
    }
    
}
