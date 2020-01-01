//package com;

public class GN {
	public static void main(String [] args){
		for(int n = 3;n<10;n+=2){
			System.out.println(n);
			for(int i = 1;i<100;i+=1){
				if(n*(n*n - 1)%i == 0){
					System.out.print(" "+i);
				}
			}
			System.out.println();
		}
	}
}
