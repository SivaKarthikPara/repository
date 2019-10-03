package com;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unused")
public class PureT {
	
	public static void main(String [] args) throws Exception{
		try{
		//ImpureT im = new ImpureT();
		//im.impure("");
		//im.impure("","","");
		Method[] methods = new ImpureT().getClass().getDeclaredMethods();
		boolean overload = false;
		Set<String> set=new HashSet<>();
		//System.out.println(Arrays.toString(methods));
		for(int i = 0;i < methods.length;i++){
			if(set.contains(methods[i].getName())){
				overload = true;
				break;
			}
			set.add(methods[i].getName());
		}
		if(overload){
			throw new Exception("don't overload      ..");
		}else{
			System.out.println("");
		}}catch(Exception e){
			//e.printStackTrace();
			System.out.println("don't overload      ..");
		}
		
			
	}
}
