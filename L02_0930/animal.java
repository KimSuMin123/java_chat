package L02_0930;

public class animal {

	public static void main(String[] args) {

		String s2 = "고양이/강아지/코끼리/개구리";
		String[] arr_animal = s2.split("/");
		
		for(int i = 0; i < arr_animal.length; i++) {
			System.out.println(arr_animal[i]);
		}
	}
}
