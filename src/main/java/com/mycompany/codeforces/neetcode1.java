/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeforces;

/**
 *
 * @author USER
 */

import java.util.*;
public class neetcode1 {
    
    
    public static void main(String args[]){
    Scanner inp=new Scanner(System.in);
    
    
    int[] nums= new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
    
    boolean ans= containsDuplicate(nums);
    
    
        System.out.println(ans);
    
    
    }
    
    
    
   public static boolean containsDuplicate(int[] nums) {
       
       
       Set<Integer> s = new HashSet<Integer>();
       
       
       for(int i=0;i<nums.length;i++){
           
           
           if(s.add(nums[i])){
           
           }
           else{
           return true;
           }
       
       }
       
       return false;
        
    }
}


