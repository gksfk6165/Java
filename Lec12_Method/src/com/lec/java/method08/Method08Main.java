package com.lec.java.method08;

import java.util.Random;
import java.util.Scanner;

/* 메소드 연습 : 컴퓨터 생각 맞추기 게임 
 * 1. 메뉴를 보여주고
 * 2. 사용자로부터의 입력을 받고
 * 3. 컴퓨터의 생각(난수)와 비교 판정 내기
 * 4. 사용자가 메뉴에서 '종료' 누르면 종료 시키기
 */
public class Method08Main {

	public static void main(String[] args) {
		System.out.println("컴퓨터 생각 맞추기 게임");
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			showMenu();
			int choice=inputChoice(sc);
			
			if(choice==0) {
				break;
			}
			int com=new Random().nextInt(3)+1;
			
			if(com==choice) {
				System.out.println("정답");
			}else {
				System.out.println("오답"+"컴퓨터는"+com);
			}
			
			
		}
		// TODO

		sc.close();
		System.out.println("\n프로그램 종료");
	} // end main

	// 메뉴 보여주기
	// 메소드 이름 : showMenu()
	// TODO
	public static void showMenu() {
		System.out.println("-----------------");
		System.out.println("컴퓨터의 생각을 맞춰보세요");
		System.out.println("1] \n 2] \n 3] \n 0]종료 \n");
	}

	// 메소드 이름 : inputChoice
	// 매개변수 : Scanner sc
	// 리턴타입 : int
	// 0 ~ 3 까지의 정수를 Scanner 로부터 입력받아 리턴
	// 범위 밖의 수일때는 재입력받는다
	public static int inputChoice(Scanner sc) {
		int userInput;
		userInput = sc.nextInt();
		while (true) {

			if (0 > userInput || 3 < userInput) {
				System.out.println("다시입력하세요");
				userInput = sc.nextInt();
			}else {
				break;
			}
		}
		return userInput;
	}

} // end class
