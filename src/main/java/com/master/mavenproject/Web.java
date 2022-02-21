package com.master.mavenproject;

import org.junit.Test;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Web {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		Select sel=new Select(null);}
@BeforeSuite
public void method() {
System.out.println("jj");	}


}
