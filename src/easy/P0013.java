package easy;

public class P0013 {
	 public static int romanToInt(String s) {
			int result = 0;
			result += countCompoundValues(s, "IV",4);
			s = new String(s.replace("IV", ""));
			result += countCompoundValues(s, "IX",9);
			s = new String(s.replace("IX", ""));
			result += countCompoundValues(s, "XL",40);
			s = new String(s.replace("XL", ""));
			result += countCompoundValues(s, "XC",90);
			s = new String(s.replace("XC", ""));
			result += countCompoundValues(s, "CD",400);
			s = new String(s.replace("CD", ""));
			result += countCompoundValues(s, "CM",900);
			s = new String(s.replace("CM", ""));
			result += countCompoundValues(s, "M",1000);
			s = new String(s.replace("M", ""));
			result += countCompoundValues(s, "D",500);
			s = new String(s.replace("D", ""));
			result += countCompoundValues(s, "C",100);
			s = new String(s.replace("C", ""));
			result += countCompoundValues(s, "L",50);
			s = new String(s.replace("L", ""));
			result += countCompoundValues(s, "X",10);
			s = new String(s.replace("X", ""));
			result += countCompoundValues(s, "V",5);
			s = new String(s.replace("V", ""));
			result += countCompoundValues(s, "I",1);
			s = new String(s.replace("I", ""));
			
			return result;
	    }
		
		public static int countCompoundValues(String s, String compound, int val) {
			String newStr = s.replace(compound, "");
			int count = ((s.length() - newStr.length()) / compound.length());
			int result = count * val;
			return result;
		}
		
		public static void main(String[]args) {
			System.out.println(romanToInt("XCVCVCDCVVI"));
		}
}
