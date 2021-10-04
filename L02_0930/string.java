package L02_0930;

import java.util.Arrays;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		
		String s = "hello!";
		String arr_s = Arrays.toString(s.toCharArray());
		
		char char13 = arr_s.charAt(13);
		char char16 = arr_s.charAt(16);
		
		System.out.println(arr_s);
		System.out.print(char13);
		System.out.println(char16);
	}
}
