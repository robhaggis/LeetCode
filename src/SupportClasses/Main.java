package SupportClasses;

import problemSolutions.P0001;

public class Main {

	public static void main(String[] args) {
		int[] data = {3,3};
		log(P0001.twoSum(data, 6));
	}

	public static void log(String s) {
		System.out.println(s);
	}
	
	public static void log(int i) {
		System.out.println(i);
	}

	public static void log(int[] i) {
		System.out.print("[");
		for (int x = 0; x < i.length; x++) {
			if(x == i.length-1) {
				System.out.print(i[x] + "]\n");
			}else {
				System.out.print(i[x] + ",");
			}
			
		}
	}
}
