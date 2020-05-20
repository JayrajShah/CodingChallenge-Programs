package ques1;
import java.util.*;

/*
 * Using methods charAt() & length() of String class, write a program to print the
frequency of each character in a string.
“Hello friend”

Output should be
-: 1
d: 1
e: 2
f: 1
(continued for all character in the string)
*/

public class letterFreq {

	public static void main(String args[])
	   {
	        String str;
	        int count = 0;
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter a String : ");
	        str=in.nextLine();
	        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
	        
	        for(int i=0;i<str.length();i++) {
	        	if(hmap.containsKey(str.charAt(i))) {
	        		count = hmap.get(str.charAt(i));
	        		hmap.replace(str.charAt(i),++count);
	        	}
	        	else 
	        		hmap.put(str.charAt(i),1);
	        }
	        
	        for(char ch: hmap.keySet()) {
	        	
	        	if(ch==' ') 	
	        		System.out.println("-:"+hmap.get(ch));
	        	
	        	else 
	        		System.out.println(ch+":"+hmap.get(ch));
	        } 
	        in.close();
	   }
}

//Program By Jayraj Shah