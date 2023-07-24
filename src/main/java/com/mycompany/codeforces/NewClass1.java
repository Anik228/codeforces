/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeforces;

/**
 *
 * @author USER
 */

//ACCEPTED

import java.util.*;
public class NewClass1{
    
   public static void main(String args[]){
   
       Scanner inp=new Scanner(System.in);
       
       
      String s=inp.nextLine();
      
      int sum=0;
      
      for(int i=0;i<s.length();i++){
          
     
      
      if(s.charAt(i)=='I'  && i!=s.length()-1 && s.charAt(i+1)=='V'){
          
         sum=sum+4;
         i++;
      
      }
      else if(s.charAt(i)=='I' && i!=s.length()-1 && s.charAt(i+1)=='X'){
          
         sum=sum+9;
         i++;
      
      }
      
      else if(s.charAt(i)=='X'  && i!=s.length()-1 && s.charAt(i+1)=='L'){
          
         sum=sum+40;
         i++;
      
      }
      
      
        else if(s.charAt(i)=='X'  && i!=s.length()-1 && s.charAt(i+1)=='C'){
          
         sum=sum+90;
         i++;
      
      }
        
         else if(s.charAt(i)=='C'  && i!=s.length()-1  && s.charAt(i+1)=='D'){
          
         sum=sum+400;
         i++;
      
      }
          else if(s.charAt(i)=='C'  && i!=s.length()-1 && s.charAt(i+1)=='M'){
          
         sum=sum+900;
         i++;
      
      }
      else{
              
          if(s.charAt(i)=='I'){
          
         sum=sum+1;
      
      }
      
      
      else if(s.charAt(i)=='V'){
          
         sum=sum+5;
      
      }
      
       else if(s.charAt(i)=='X'){
          
         sum=sum+10;
      
      }
      
      
      
      
       else if(s.charAt(i)=='L'){
          
         sum=sum+50;
      
      }
       else if(s.charAt(i)=='C'){
          
         sum=sum+100;
      
      }
      
       else if(s.charAt(i)=='D'){
          
         sum=sum+500;
      
      }
       else if(s.charAt(i)=='M'){
          
         sum=sum+1000;
      
      }
      
      }
      }
        
      
      System.out.println(sum);
    
      
}
}
