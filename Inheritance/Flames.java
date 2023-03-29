package Inheritance;
import java.util.*;
import java.io.*;
class Flames
{
	// reading strings
	String S1,S2;
	Flames(String ss1,String ss2)
	{
		S1=ss1;
		S2=ss2;
	}

	//printimg the two strings
	void display()
	{
		System.out.println(S1);
		System.out.println(S2);
	}

	//splitting and making them as Arraylists
	public ArrayList<String> strToArrList(String str)
	{
		String[] a=str.split("");
		ArrayList<String> list1= new ArrayList<String>(Arrays.asList(a));
		for(String s: list1)
		{
			System.out.println(s);
		}
		return list1;
	}


	int finalCount(ArrayList<String> list1,ArrayList<String> list2)
	{
		for(String s: list1)
		{
			if(list2.contains(s))
			{
				list2.remove(s);
			}
			else
			{
				list2.add(s);
			}
			System.out.println(list2);
		}
		return list2.size();
	}
	public static void main(String args[])
	{
		Flames f=new Flames("radha","krishna");
		f.display();
		ArrayList<String> list1 = f.strToArrList(f.S1);
		ArrayList<String> list2 = f.strToArrList(f.S2);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("count:" + f.finalCount(list1,list2));
	}
}