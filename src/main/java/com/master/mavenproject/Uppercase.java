package com.master.mavenproject;

public class Uppercase {
public static void main(String[] args) {
	String str="AutomatION";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>=65 && str.charAt(i)<=90) {
			System.out.println(str.charAt(i));
		}
	}
}
}
