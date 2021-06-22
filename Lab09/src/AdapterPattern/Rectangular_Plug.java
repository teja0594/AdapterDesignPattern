package AdapterPattern;

import java.util.Scanner;

public class Rectangular_Plug {
	 Scanner sc = new Scanner(System.in) ;
	
	void Power()
	{
		  System.out.print("Enter String number1:");
		  String s1 = sc.next();
		  System.out.print("Enter String number2:");
		  String s2 = sc.next();
		  Adapter ad = new Adapter();
		  int power = ad.Adapt(s1, s2);
		  System.out.println(power);
		  
	}
}