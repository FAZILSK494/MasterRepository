package com.master.mavenproject;

public class Reverse {
public static void main(String[] args) {
	String str="im fazil btech";
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	
}
}
