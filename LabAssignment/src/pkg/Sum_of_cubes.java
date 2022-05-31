package pkg;

import java.util.Scanner;

public class Sum_of_cubes {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter input");
    int num=sc.nextInt();
     int sum=0;
    	while(num>0) {
    		int mod=num%10;
    		sum=sum+(int) Math.pow(mod,3);
    		num=num/10;
    		
    	}
    	System.out.println("sum of cubes is"   +sum);//225
    	
    }

		

	}


