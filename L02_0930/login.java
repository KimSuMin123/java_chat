package L02_0930;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {

		String id;
		String pw;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� : ");
		id = sc.next();
		System.out.println("��й�ȣ : ");
		pw = sc.next();
		
		System.out.println("id : " + id.trim());
		System.out.println("pw : " + pw.trim());

	}

}
