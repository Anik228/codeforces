/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeforces;

import java.util.*;
public class mediumnumber{
    public static final int NUM = 31;
    public static void main(String args[]){
        
        Scanner inp=new Scanner(System.in);
        
        int t=inp.nextInt();
        inp.nextLine();
        
        for(int j=0;j<t;j++){
            
            
        int n=inp.nextInt();
            
            
        inp.nextLine();
        String s=inp.nextLine();
        
        int arr[]=new int[s.length()];
        
        for (int i = 0; i <s.length(); i++) {
            
            
            arr[i]=(s.charAt(i) & NUM);
 
          //  System.out.print((s.charAt(i) & NUM) + " ");
            
        }
        Arrays.sort(arr);
        
        System.out.println(arr[s.length()-1]);
        }
    
    }
}
