package chap99_etc;

import java.util.Scanner;

public class _04_numBasball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 필요한 변수들 선언
		//스트라이크와 볼의 개수를 세어줄 변수
		int strike = 0;
		int ball = 0;
		
		//게임 회수(사용자가 입력할 때마다 1씩 증가)
		int gameCnt = 0;
		
		//컴퓨터 랜덤 값 3개 저장할 배열(중복 불가능)
		int[] com = new int[3];
		
		//유저가 입력한 3개 값 저장할 배열(중복 불가능)
		int[] user = new int[3];
		
		//입력값 받을 스캐너
		Scanner sc = new Scanner(System.in);
		
		//2. 랜덤 값 3개 생성(중복되면 다시 생성하도록 처리)
		//중복처리 방식 : 0번째 인자 값은 검사 X, 1번째 인자 값부터 검사
		//현재 입력된 인덱스의 값이랑 전에 입력된 모든 값 비교 같은 게 나오면
		//i--, 다시 for문으로 돌아가도록
		for(int i = 0; i < com.length; i++) {
			int ramdomVal = (int)(Math.random() * 9) + 1;
			
			com[i] = ramdomVal;
			
			//중복인지 아닌지 판단할 변수
			boolean isComDuplicated = false;
			
			//중복체크
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(com[i] == com[j]) {
						isComDuplicated = true;
						break;
					}
				}
			}
			
			//isComDuplicated == true 같은 의미
			//isComDuplicated == false 일 때는 !isDupulicated
			if(isComDuplicated) {
				//중복이 true면 해당 인덱스 랜덤 값 다시 생성
				i--;
				//다시 for문의 증감식으로 보내줌
				continue;
			}
		}
		
		//com 배열 확인
		System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
		
		//3. 사용자 입력 값 3개 받아서 user배열에 저장
		//gameCnt++; 회수 증가
		//3스트라이크가 될 때 까지 반복되도록 while 무한루프로 감싸줌
		while(true) {
			//사용자가 다시 입력하기 전에 strike와 ball 0으로 초기화
			//초기화 안하면 이전 입력된 값의 strike, ball의 값을 가지고있음
			strike = 0;
			ball = 0;
			
			for(int i = 0; i < user.length; i++) {
				System.out.print("1 ~ 9까지 숫자를 입력하세요.");
				int userNum = sc.nextInt();
				
				user[i] = userNum;
				
				//중복확인 변수
				boolean isUserDuplicated = false;
				
				for(int j = 0; j < i; j++) {
					if(user[i] == user[j]) {
						isUserDuplicated = true;
						System.out.println("중복된 값은 허용되지 않습니다.");
						break;
					}
				}
				
				if(isUserDuplicated) {
					i--;
					continue;
				}
			}
			
			//입력회수 증가
			gameCnt++;
			
			//사용자 입력 값 확인
			System.out.println(user[0] + ", " + user[1] + ", " + user[2]);
			
			//4. 스트라이크/볼 판정
			//중첩 for문 사용
			//com[i] == user[j] 일 때
			//i == j 스트라이크 판정 strike++
			//com[i] == user[j] 일 때
			//i != j 볼 판정 ball++
			for(int i = 0; i < com.length; i++) {
				for(int j = 0; j < user.length; j++) {
					if(com[i] == user[j]) {
						if(i == j) //값과 위치가 같은 경우
							strike++;
						else //값만 같고 위치는 다를 경우
							ball++;
					}
				}
			}		
			
			//5. 스트라이크/볼 출력
			System.out.println(strike + "스트라이크, " + ball + "볼입니다.");
			
			//6. 스트라이크와 볼 개수로 다시 3스트라이크 아닐 때
			//다시 사용자 입력받도록 
			//3스트라이크 일 때는 게임 종료
			if(strike < 3) {
				//while문으로 다시 보내줌
				//사용자 입력 값 다시 받기
				continue;
			} else {
				System.out.println(gameCnt + "회만에 맞추셨습니다.");
				break;
			}
		
		}
		
		
		
		
		
		
		
	}

}
