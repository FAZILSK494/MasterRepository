package com.master.mavenproject;

public class Result_class {
public static void main(String[] args) {
	Class c=new Class();
c.interface_a();
c.abstract_a();

Abstract_class ac=new Class();
	ac.abstract_a();
	ac.abstract_b();
	ac.abstract_faz(2);
	ac.abstract_faz("faz");

	Interface i=new Class();
i.interface_a();
i.interface_b();
i.interface_c();
		

}
}