package epam;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class startsWithA {
	public static void main(String[] args) {
		int n;
		ArrayList<String> arr=new ArrayList<String>();
		ArrayList<String> res=new ArrayList<String>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Strings : ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)	arr.add(sc.next());
		res=(ArrayList<String>) arr.stream().filter(ele-> ele.charAt(0)=='a' && ele.length()==3).collect(Collectors.toList());
		System.out.println(res);
		sc.close();
	}
}