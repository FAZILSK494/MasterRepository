package com.master.mavenproject;

public class CHK_DUPLICATES {
public static  void main(String[] args) {
	int count=0;
	String[] arr= {"1","2","3","4","5","6","6","8","2"};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j]) {
				
				count++;
				System.out.println("dup avles: " +arr[j]);
			}
			}
	

}System.out.println(count);}}
