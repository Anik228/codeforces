//Name: Anik Lal Dey
//Id  : 2020-1-60-228

package com.mycompany.codeforces;
import java.util.*;
import java.io.*;
public class mergeSort {
    public static void main(String args[])
            
            throws IOException{

    List<String> stngFile=new ArrayList<String>();

    BufferedReader bfredr=new BufferedReader(new FileReader("C:\\Users\\USER\\Desktop\\run1.txt"));

    String text=bfredr.readLine();

    while(text!=null){

        stngFile.add(text);
        text=bfredr.readLine();
    }
    
    bfredr.close();

    String[] array1=stngFile.toArray(new String[0]);
    
    int arr1[]=new int[array1.length];
    
    
    for(int i=0;i<array1.length;i++){

    arr1[i]=Integer.parseInt(array1[i]);

    }


    List<String> stngFile1=new ArrayList<String>();
    
    BufferedReader bfredr1=new BufferedReader(new BufferedReader(new FileReader("C:\\Users\\USER\\Desktop\\run2.txt")));

    String text1=bfredr1.readLine();

    while(text1!=null){

        stngFile1.add(text1);
        text1=bfredr1.readLine();


    }
    
    bfredr1.close();

    String[] array2=stngFile1.toArray(new String[0]);
    
    
    int arr2[]=new int[array2.length];
    
    
    for(int i=0;i<array2.length;i++){

    arr2[i]=Integer.parseInt(array2[i]);
   

    }

     
    int n1 = arr1.length;
    
    int n2 = arr2.length;
    
    int[] mergedArr = new int[n1 + n2];
    
    int i = 0, j = 0, k = 0;
    
    while (i < n1 && j < n2) {
        if (arr1[i] <= arr2[j]) {
            mergedArr[k] = arr1[i];
            i++;
        } else {
            mergedArr[k] = arr2[j];
            j++;
        }
        k++;
    }
    
    
    while (i < n1) {
        mergedArr[k] = arr1[i];
        i++;
        k++;
    }
    while (j < n2) {
        mergedArr[k] = arr2[j];
        j++;
        k++;
    }
 

 FileWriter fWriter = new FileWriter(
                "C:\\Users\\USER\\Desktop\\sorted.txt");
 
 
 for(int l=0;l<mergedArr.length;l++){
 fWriter.write(String.valueOf(mergedArr[l]));
 fWriter.write('\n');
 
 }
 fWriter.close();
 
 System.out.println("Successfully writed "+mergedArr.length+" values in sorted.txt file");
 

 }


}
