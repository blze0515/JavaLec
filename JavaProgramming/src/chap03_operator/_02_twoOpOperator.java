package chap03_operator;

public class _02_twoOpOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 대입연산자
		//왼쪽 항의 변수에 오른쪽 항을 값을 대입
		int a = 10;
		int b = 6;
		
		//2. 산술연산자
		int num1 = 30;
		int num2 = 7;
		int result;
		
		result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		
		result = num1 - num2;
		System.out.println("num1 - num2 = " + result);
		
		result = num1 * num2;
		System.out.println("num1 * num2 = " + result);
		
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result);
		
		result = num1 % num2;
		System.out.println("num1 % num2 = " + result);
		System.out.println("-----------------------------------");
		
		//3. 복합 대입 연산자
		int num3 = 10;
		int num4 = 3;
		
		num3 += num4;
		System.out.println("num3 += num4" + num3);
		
		num3 -= num4;
		System.out.println("num3 -= num4" + num3);
		
		num3 *= num4;
		System.out.println("num3 *= num4" + num3);

		num3 /= num4;
		System.out.println("num3 /= num4" + num3);
		
		num3 %= num4;
		System.out.println("num3 %= num4" + num3);
		
		//4. 관계연산자
		int num5 = 100;
		int num6 = 300;
		boolean result2;
		
		result2 = num5 < num6;
		System.out.println("num5 < num6 = " + result2);
		
		result2 = num5 > num6;
		System.out.println("num5 > num6 = " + result2);
		
		result2 = num5 <= num6;
		System.out.println("num5 <= num6 = " + result2);
		
		result2 = num5 >= num6;
		System.out.println("num5 >= num6 = " + result2);
		
		result2 = num5 == num6;
		System.out.println("num5 == num6 = " + result2);
		
		result2 = num5 != num6;
		System.out.println("num5 != num6 = " + result2);
		
		//4. 논리연산자
	}

}
