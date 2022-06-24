package domain;

import java.util.Arrays;

// VO 값을 저장할 객체
// 생성자 만들기
public class Student {
	// 학번, 이름, 국어,영어,수학 점수
	// 학번 전화번호 군번 주민번호는 int타입보다 String를 사용하는게 좋다
	 private String no;     // = "1"; 명시적 초기화 
	 private String name;
	 private int kor;
	 private int eng;
	 private int mat; 
	// 생성자를 만들때는 기본 생성자를 제일 위에 두는게 좋다
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String no, String name) {
		this(no, name, getScore(), getScore(), getScore());
	}
	

	public Student(String no, String name, int kor, int eng, int mat) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	

	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMat() {
		return mat;
	}


	public void setMat(int mat) {
		this.mat = mat;
	}


	public int sum() {
		return this.kor + this.eng + this.mat;  
	}
	
	public double avg() {
		return (int)(sum() / 3d * 100) / 100d;
	}

	// 점수 랜덤
	private static int getScore() {
		return (int) (Math.random() * 41) + 60;
	}
	
	public String toString() {
		String str = getNo()+"   "+getName()+"    "+kor+"       "+eng+"       "+
				mat+"       "+sum() +"     "+avg() ;
		return str;
	}
}
