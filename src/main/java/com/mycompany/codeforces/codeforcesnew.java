/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeforces;






import java.util.*;

public class codeforcesnew {
    
    public static void main(String args[]){
    
    
    Scanner inp=new Scanner(System.in);
    
    int t=inp.nextInt();
    
    inp.nextLine();
    
    for(int i=0;i<t;i++){
         Set<String> n= new HashSet<>();
    int num=inp.nextInt();
    inp.nextLine();
    
    String r=inp.nextLine();
    
    String s=r.toUpperCase();
    
    for(int j=0;j<s.length();j++){
        
    n.add(String.valueOf(s.charAt(j)));
    
    }
    
        String temp = "" + s.charAt(0);
 
        for (int j = 1; j < s.length(); j++) {
            if (!temp.contains(String.valueOf(s.charAt(j))))
                temp = temp + s.charAt(j);
        }
            
  
    String s1=temp.toUpperCase();
    
      
    String s2="MEOW";
  
    if(s1.equals(s2)){
        
      if(s.length()>4){
      
      if(s.contains("MEOW") || s.contains("meow")){
      
      System.out.println("No");
      }
      
      else{
      
      
      System.out.println("Yes");
      }
      }
      
      else{
      
      System.out.println("Yes");
      }
        
      
    }
    
    else{
    
    System.out.println("No");
    
    }
    
    n.clear();
    
    
    }
    
    }
    
    
}
