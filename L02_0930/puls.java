package L02_0930;

	import java.util.Arrays;
	import java.util.Scanner;

	public class puls {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        System.out.println("hello world");
	        school s_s = new school();
	        school s_s2 = new school("Seogwipomiddle",1);

	        String id;
	        String pw;

	        Scanner sc = new Scanner(System.in);
	        System.out.println("���̵� :");
	        id = sc.next();
	        System.out.println("��й�ȣ :");
	        pw = sc.next();

	        System.out.println("id : " + id.trim());
	        System.out.println("pw : " + pw.trim());

	        String s = "hello!";
	        String arr_s = Arrays.toString(s.toCharArray());

	        char char13 = arr_s.charAt(13);
	        char char16 = arr_s.charAt(16);

	        System.out.println(arr_s);
	        System.out.print(char13);
	        System.out.println(char16);

	        String s_s3 = "You are a Lucky duck";
	        int index_Lucky = s_s3.indexOf("Lucky");
	        System.out.println("index : " + index_Lucky);

	        String s2 = "�����/������/�ڳ���/������";
	        String[] arr_animal = s2.split("/");

	        for(int i = 0; i <= arr_animal.length; i++) {
	            System.out.println(arr_animal[i]);
	        }
	        String s3 = "text.txt";
	        boolean end = s3.endsWith(".txt");
	        System.out.println(end);
	    }
	}
