/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeforces;

import java.util.*;

import java.lang.*;
public class stringChecker{//Om namah shivayao
    
    public static void main(String args[]){
    
    Scanner inp=new Scanner(System.in);
    
    
    int t=inp.nextInt();
    inp.nextLine();
    
    for(int i=0;i<t;i++){
    
    
        String s=inp.nextLine();
        
        int count=1,coun=0,cou=0;
        
        
        if(s.length()==1 && s.charAt(0)!='?'  && s.charAt(0)!='0'){
        
        
        System.out.println(1);
        
       
        continue;
        
        }
        
        else if(s.charAt(0)=='0'){
        
        
            System.out.println(0);
            continue;
        
        
        }
        
        
        
        for(int j=0;j<s.length();j++){
        
            if(s.charAt(j)=='?' && j==0){
            
                count=count*9;
                cou++;
                
                
            
            }
            
            else if(s.charAt(j)=='?' && j!=0){
                
              
                count=count*10;
                cou++;
               
        
        }
            
            else if(s.charAt(j)=='0'){
            
            
                coun++;
                
            }
           
        }
        
        if(count==1 && coun!=s.length() && cou!=0){
        
            System.out.println(count);
            
            continue;
        }
        
        else if(coun==s.length()){
        
        System.out.println(0);
        
        }
        else{
            
            
            System.out.println(count);
        }
    
    
    
    }
    
    
    }
}
