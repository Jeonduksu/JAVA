package com.test.chap01;
//퍼블릭 클래스 클래스명
public class Score {
	//필드
	//멤버 변수
	private String name = "전덕수";
	private int kor = 90;
	private int eng = 86;
	private int math = 97;
	
	//메소드는 중괄호를 갖고있다
	//생성자
	public Score() {}
	
	//총합을 구해 출력하는 기능
	public void sum() {
		int s;		
		s = kor + eng + math;
		System.out.println("합계 : " + s);
	}
	//평균을 구해 출력하는 기능
	public void avg() {
		double a;
		a = kor + eng + math / 3.0;
		System.out.println("평균 : " + a);
	}
	//제일 높은 점수를 받은 과목을 찾아 출력하는 기능
	public void max() {
		int b;
		b = kor;
		if(b<eng) {
			if(eng> math) {
				b = eng;
			}
		}else if(math > eng) {
			if(math > b) {
				b = math;
			}
		}else {
			b = kor;
		}
		System.out.println("최댓값 : " + b);
	}
	//필드값 확인할수 있는 기능
	public void prn() {
		System.out.println(name+ "학생의 국어점수 : " + kor + "영어점수" + eng
				+ "수학점수" + math +"이다.");
	}
	
}
