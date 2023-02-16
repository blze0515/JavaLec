package chap05_class;

import java.util.Scanner;

import chap05_class.example.DistanceChanger;

public class _11_classExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//숙제 - while문을 이용해서 무한으로 프로그램 재시작
		//q나 Q가 입력됐을 때(엔터키 포함) 프로그램 종료
		System.out.print("거리의 단위를 변환합니다.(q, Q 입력 시 종료)");
		//스캐너로 입력 값 받기
		
		System.out.print("변환할 거리를 입력해주세요.(정수, m단위) : ");
		long distance = sc.nextLong();
		
		System.out.print("변환할 단위를 입력해주세요.(cm, mm, km, inch)");
		String unit = sc.next();
		
		//객체생성
		DistanceChanger dc = new DistanceChanger(distance, unit);
		
		//변환된 단위로 출력
		dc.change();
		
		
		
		
		
		
		
		
	}

}
