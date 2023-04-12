package Inheritance;

import java.io.*;
import java.util.*;
class Flames2
{
    public static void main(String[] args)
    {
        String name="gowri";
        String name1="krishna";
        int count=0;
        StringBuilder sb1 = new StringBuilder(name);
        StringBuilder sb2 = new StringBuilder(name1);
        for (int i = 0; i < sb1.length(); i++)
        {
            char c = sb1.charAt(i);
            int index = sb2.indexOf(String.valueOf(c));
            if (index != -1)
            {
                sb1.deleteCharAt(i);
                sb2.deleteCharAt(index);
                i--;
            }
        }
        name = sb1.toString();
        name1 = sb2.toString();
        System.out.println(name);
        System.out.println(name1);
        String real=name+name1;
        for(int i = 0; i < real.length(); i++)
        {
           if(real.charAt(i) != ' ')
           {
               count++;
           }
        }
        System.out.println(count);
        String star="FLAMES";
        
        for(int t=star.length();t>=1;t--)
        {
            while(star.length()>1)
            {
                while(count>t)
                {
                    int rem=count%t;
                    char g=star.charAt(rem);
                    String d=String.valueOf(g);
                    String c="";
                    star=star.replace(d,c);
                }
                 while(count<t && count<star.length())
                {
                    char e=star.charAt(count);
                    String f=String.valueOf(e);
                    String a="";
                    star=star.replace(f,a);
                    count++;
                }
            }
            if(star.length()==1)
            {
                if(star.equals("F"))
                {
                    System.out.println("They are FRIENDS");
                }
                if(star.equals("L"))
                {
                    System.out.println("They are LOVERS");
                }
                if(star.equals("A"))
                {
                    System.out.println("They are AFFECTIONATE");
                }
                if(star.equals("M"))
                {
                    System.out.println("They are MARRIED");
                }
                if(star.equals("E"))
                {
                    System.out.println("They are ENEMIES");
                }
                if(star.equals("S"))
                {
                    System.out.println("They are SISTERS");
                }
            }
        }
    }
}