/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codeforces;

import java.util.*;
import java.io.*;
public class Codeforces{
   
   public static void main(String args[])
    {  
     String file1, file2, file3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter file1 : ");
        file1 = scan.nextLine();
        System.out.print("Enter file2 : ");
        file2 = scan.nextLine();
        System.out.print("Enter the third file  : ");
        file3 = scan.nextLine();
        
 
        File[] files = new File[2];
        files[0] = new File(file1);
        files[1] = new File(file2);
        File mergedF3 = new File(file3);
        mergeFiles(files, mergedF3);
    
         }
 
    public static void mergeFiles(File[] files, File mergedF3)
    { 
        FileWriter fstream = null;
        BufferedWriter out = null;
    
        try
        {
            fstream = new FileWriter(mergedF3, true);
            out = new BufferedWriter(fstream);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    
        for(File f : files)
        {
            FileInputStream fis;
            try
            {
                fis = new FileInputStream(f);
                BufferedReader in = new BufferedReader(new InputStreamReader(fis));
 
                String aLine;
                while((aLine = in.readLine()) != null)
                {
                    out.write(aLine);
                    out.newLine();
                }
 
                in.close();
            }
            catch(IOException e1)
            {
               e1.printStackTrace();
            }
        }
        System.out.print("\nIts successfully working");
 
        try
        {
            out.close();
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }
    }
}

