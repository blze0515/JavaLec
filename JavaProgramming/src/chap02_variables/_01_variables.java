package chap02_variables;

public class _01_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. int 변수 선언
		int num1;
		
		//2. int 변수 초기화
		num1 = 100;
		
		//3. 변수의 사용
		System.out.println("int 변수 출력");
		System.out.println(num1);
		System.out.println("----------------------------------");
		
		//4. long 변수 선언과 초기화
		long bigNum1 = 100000000L;
		
		//5. 변수의 사용
		//syso입력 후 ctrl + space
		System.out.println("long 변수 출력");
		System.out.println(bigNum1);
		System.out.println("----------------------------------");
		
		//6. short 변수의 연산
		short sNum1 = 1;
		short sNum2 = 2;
		
		//7. int로 자동 변환되는 short의 연산 결과
		System.out.println("short 연산 결과 출력");
		System.out.println(sNum1 + sNum2);
		System.out.println("----------------------------------");
		
		//8. char 변수 선언과 초기화
		char ch1 = 'A';
		int ch2 = 'A';
		
		//9. char 변수 사용
		System.out.println("char 변수 출력");
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println((int)ch1);
		System.out.println("----------------------------------");
		
		//10. 실수형 변수 선언과 초기화
		float fNum = 3.14f;
		double dNum = 3.14;
		
		//11. 실수형 변수 사용
		System.out.println("실수형 변수 출력");
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println("----------------------------------");
		
		//12. boolean 변수선언과 초기화
		boolean result1 = false;
		boolean result2 = false;
		
		int num2 = 10;
		int num3 = 11;
		
		//삼항 연산자(?의 앞의 조건이 충족하면 ? 뒤의 값, 
		//          충족하지 못하면 :뒤의 값을 선택)
		//num2를 2로 나눈 나머지 값이 0이면 true 0이 아니면 false
		result1 = num2 % 2 == 0 ? true : false;
		//num3를 2로 나눈 나머지 값이 0이면 true 0이 아니면 false
		result2 = num3 % 2 == 0 ? true : false;
		
		//13. boolean 변수의 사용
		System.out.println("boolean 변수 출력");
		System.out.println(result1);
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
