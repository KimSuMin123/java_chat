package L01_0923;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		int value = 0;
		
		Scanner sc = new Scanner(System.in); //�ʼ�
		
		do {
			value =sc.nextInt();
			System.out.println("�Է¹��� �� : " + value);
		}while(value != 10);
		
			System.out.println("�ݺ��� ����");
	}
}
