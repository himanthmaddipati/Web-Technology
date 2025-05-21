package com.java.collections;

interface info1
{
	void sum(int x,int y);
	void product(int x,int y);
}
public class InterfaceExamp implements info1{

	public void sum(int x,int y) {
		System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
	}
	public void product(int x,int y) {
		System.out.println("Product of "+x+" and "+y+" is "+(x*y));
	}
	public int diff(int x,int y) {
		return (x-y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		info1 ob = new InterfaceExamp();
		ob.sum(10, 20);
		ob.product(2,5);
//		ob.diff(10,5);
	}

}
