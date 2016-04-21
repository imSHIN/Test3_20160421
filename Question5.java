package pers.test5;

import java.util.Scanner;

class Judgement{
	String j;
	
	public void setString(String i){
		j=i;
	}
	
	public boolean isSubString(String s){
		return j.contains(s);
	}
}

public class Question5{
	public static void main(String[] args){
		System.out.println("Enter a string");
		
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		
		System.out.println("Enter a substring");
		String b=scan.nextLine();
		
		Judgement u=new Judgement();
		u.setString(a);
		
		if(u.isSubString(b)){
			System.out.println("The second string is the substring of the first one. ");
		}
		else{
			System.out.println("The second string is not the substring of the first one. ");
		}
		
	}
}
