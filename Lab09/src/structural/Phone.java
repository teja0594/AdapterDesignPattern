package structural;

import java.util.Scanner;

public class Phone {
 public static void main(String[] args){
	 Scanner sc= new Scanner(System.in);
	   String ac_voltage="240";
	   System.out.println("Power Supply:"+ac_voltage+"V\n");
	   Charger c = new Charger();
	 int dc_voltage= c.convert(ac_voltage);
	  System.out.println("Charger Output:"+dc_voltage+"V\n");
	  System.out.println("Phone is Charging............");
	   sc.close();
 }
}
