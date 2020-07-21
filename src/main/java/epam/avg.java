package epam;

import java.util.ArrayList;
import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		int a;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Numbers : ");
		a=sc.nextInt();
		for(int i=0;i<a;i++)	
			arr.add(sc.nextInt());
		
		Double avg=arr.stream().mapToInt(val -> val).average().getAsDouble();
		System.out.println("Average is : "+avg);
		sc.close();
	}

}
