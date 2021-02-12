package pack1;

import java.util.Scanner;

public class Class1 {
	
	private int fnum;
	private int snum;
	
	
	public void sum2() {
		System.out.println("enter two nos");
		Scanner scan = new Scanner(System.in);
		
		
	}
		
	public void setfnum(int fnum ) 
	{
		this.fnum=fnum;
	}
	
	public void setsnum(int snum)
	{
	this.snum=snum;	
		
	}
	
	public int getfnum() {
		
		return fnum;
		
	}
	
	public int snum() {
		return snum;
		
	}
	
	public int getSum(int a,int b) {
		
		int sum= a+b;
		return sum;
		
	}
	

}
