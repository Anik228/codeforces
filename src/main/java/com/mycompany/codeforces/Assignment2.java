//Name: Anik Lal Dey
//ID  : 2020-1-60-228

package com.mycompany.codeforces;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Assignment2 {
    
   
    public static void main(String args[]) throws FileNotFoundException, IOException{
    Scanner scan = new Scanner(System.in);
           
    List<String> stngFile=new ArrayList<String>();

    BufferedReader bfredr=new BufferedReader(new FileReader("C:\\Users\\USER\\Desktop\\document.txt"));

    String text=bfredr.readLine();

    while(text!=null){

        stngFile.add(text);
        text=bfredr.readLine();
    }
    
    bfredr.close();

     String[] array1=stngFile.toArray(new String[0]);
   
     String str=Arrays.toString(array1);
   
     System.out.println("After file read"+ str);
    
     String[] sp = str.split("[.]", 0);
   
     String strNew = sp[0].replace("[", "");
    
     Set<String> set = new HashSet<String>();
     
     String[] s3 = strNew.split(" ");
     
     String[] s4 = sp[1].split("[, ]+");
     
     
     System.out.println("First document all vocabolary list: " + Arrays.toString(s3));
     
     System.out.println("Second document all vocabolary list:: " + Arrays.toString(s4));
     
     //1. Find and output the list of vocabulary.
       
      int length1=s3.length;
     
      int length2=s4.length;
         
      String arr[]=new String[6];
      
      int count=0;
       
     for(int i=0;i<length1;i++){
             
         String upper=s3[i].toUpperCase();//coverting upper case for ensure uniqueness of the vocabolary list
         
         if(set.add(upper)){
             
             arr[count]=s3[i];
             
             count++;
         
         }
     
     }
    
     for(int i=0;i<length2;i++){
         
       String upper=s4[i].toUpperCase();//Here also coverting upper case for ensure uniqueness of the vocabolary list
         if(set.add(upper) && s4[i]!="["){
             
             arr[count]=s4[i];
             
             count++;
         
         }
         
     
     }
     
    System.out.println("output list of vocabulary of two document");
     
    System.out.println(Arrays.toString(arr));//1.output the list of vocabulary.
   
    count=0;
    int coun=0;
    int arr1[]=new int[7];
    
    int arr2[]=new int[7];
      
   for(int i=0;i<6;i++){
   
   for(int j=0;j<s3.length;j++){
     
   
   if(arr[i]==s3[j]){
   
       arr1[count]=1;
       count++;
       coun++;
       
       break;
   
   }
   }
   
   if(coun==0){
   
   arr1[count]=0;
   count++;
   }
   coun=0;
   
   }
  
   coun=0;
   count=0;
   
   
   for(int i=0;i<6;i++){
       
   String up1=arr[i].toUpperCase();
   
   for(int j=0;j<s4.length;j++){
       
       String up2=s4[j].toUpperCase();
     
   
   if(up1.equals(up2)){
       arr2[count]=1;
       count++;
       coun++;
       
       break;
   
   }
   }
   
   if(coun==0){
   
   arr2[count]=0;
   count++;
   }
   coun=0;
   
   }
   
   System.out.println("Word representation of D1(document one)");//extra work
   
   
   for(int i=0;i<6;i++){
   
       System.out.print(" "+arr1[i]);
   
   }
   
   System.out.println();
   
   System.out.println("Word representation of D2(document one)");//extra work
   
   
   for(int i=0;i<6;i++){
   
       System.out.print(" "+arr2[i]);
   
   }
   
   
   //2. Find and output the tf-idf vector representations of each document.
   
   
   int tfdf1[]=new int[7];
   int tfdf2[]=new int[7];
   
   for(int i=0;i<6;i++){
       
     int  df=arr1[i]+arr2[i];
     
     
     int N=2;//In our corpus, there are two documents and so N = 2.
     
     
     int value=N/df;//(N/ df(t))
     
      int result = (int)(Math.log(value) / Math.log(2));//idf(t) = log2(N/ df(t))
      
      tfdf1[i]=arr1[i]*result;//tf-idf(vocabolary come one by one) 
       
   }
   
   for(int i=0;i<6;i++){
       
     int  df=arr1[i]+arr2[i];
     
     
     int N=2;//In our corpus, there are two documents and so N = 2.
     
     
     int value=N/df;//(N/ df(t))
     
      int result = (int)(Math.log(value) / Math.log(2));//idf(t) = log2(N/ df(t))
      
      tfdf2[i]=arr2[i]*result;//(vocabolary come one by one)
        
   }
   
   System.out.println();
   
   
   System.out.println("So, the tf-idf vector representation of D1 is");
   
   
   for(int i=0;i<6;i++){
   
   
   System.out.print(" "+tfdf1[i]);
   
   }
  
   System.out.println();
   
   
   System.out.println("So, the tf-idf vector representation of D2 is");
   
   
   for(int i=0;i<6;i++){
   
   
   System.out.print(" "+tfdf2[i]);
   
   }
    
    }
}

        
    
    
    
    
    
    

