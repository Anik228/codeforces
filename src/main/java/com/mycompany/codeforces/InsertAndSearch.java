//Name:Anik Lal Dey || ID: 2020-1-60-228

package com.mycompany.codeforces;

import java.util.*;

public class InsertAndSearch {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        
        int e=100,count=0;
        
        Set<Integer> s = new HashSet<Integer>();
        
        int arr[]=new int[e];
        
        for(int i=0;i<e;i++){
            
        int a=inp.nextInt();
        int b=inp.nextInt();
        
        if(a==0){
               
            if(s.add(b)){
            
            arr[count]=b;
            count++;
            
            for (int j = count-1; j>0 ; --j) {
                   
            if(arr[j]>arr[j-1]){
             
            break;
            
            }
            
            else{
            
            int temp=arr[j];         
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            }
           
                
            }
            
        
        }
                         
        }
        
        else if(a==1){
                
    
int  low=0;
int high=count-1;
int coun=0;

while (low <=count-1) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == b){
        System.out.println("Yes");
        coun++;
        break;
      }

      if (arr[mid] < b)
        low = mid + 1;

      else
        high = mid - 1;
    }

if(coun==0){
System.out.println("No");

}

}
         
        for(int j=0;j<count;j++){
            
        System.out.println(arr[j]);
        
        }
             
    }
              
}
}
