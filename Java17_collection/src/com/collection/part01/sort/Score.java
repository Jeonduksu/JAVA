package com.collection.part01.sort;

import java.util.Objects;

public class Score implements Comparable{
	private String name;
	private int score;
	
	public Score() {}
	
	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return Objects.equals(name, other.name) && score == other.score;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", score=" + score + "]";
	}

	//((Score)o) 하는이유가 형변환 하기 위해
	//compareTo 글자를 비교 해주는데 이건 정수로 출력한다.
	//가<나<다 이렇게 해서 오름차순으로 할때 글자를 비교한다
	//양수면 자리를 바꾸고 음수면 음수 그래도 리턴한다.
	@Override
	public int compareTo(Object o) {
		//name 기준으로 오름차순 기본 정렬
		String otherName = ((Score)o).getName();
		
		return -name.compareTo(otherName);
		//오름차순으로 생각
		//"나".compareTo("가") ==> compareTo의 결과 : 양수
		//							오름차순을 위해 return해야 하는 값: 바꿔야 하니깐 양수 리턴
	}

	
	
	
}
