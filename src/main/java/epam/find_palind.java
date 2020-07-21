package epam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class palindrome {
	public static void main(String[] args) {
		int n;
		ArrayList<String> arr=new ArrayList<String>();
		ArrayList<String> res=new ArrayList<String>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Strings : ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)	arr.add(sc.next());
		res=(ArrayList<String>) arr.stream().filter(ele->ele.equals(((new StringBuffer(ele)).reverse()).toString() ) ).collect(Collectors.toList());
		System.out.println(res);
		sc.close();
	}
}
