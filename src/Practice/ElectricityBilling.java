package Practice;

import java.util.Scanner;

public class ElectricityBilling {
	
	int unit = 110;
	{
	
  if (unit >100) {
	  System.out.println("Bill:"+unit*2 );
  }
	else if(unit<100) {
		System.out.println(unit*3);
	}
		else {
			System.out.println(unit);
		}
	}
		
	public void waterBill() {
		Scanner aObj = new Scanner(System.in);
		System.out.println("Enter gallons used:");
		int gObj = aObj.nextInt();
        System.out.println(gObj*2);
	}
	static void gasBill() {
		Scanner bObj = new Scanner(System.in);
		System.out.println("Enter unit:");
		int cObj =bObj.nextInt();
		System.out.println(cObj*30);
	}
		
public static void main(String[] args) {
	ElectricityBilling eObj = new ElectricityBilling();
	eObj.waterBill();
	gasBill();
}
	}


