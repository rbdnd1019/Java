package service;

import static utils.StudentUtil.*;

import java.util.ArrayList;
import java.util.List;

import app.StudentEx;
import domain.Student;
import exception.RangeException;

/*
 *  01/17 : Student필드 정의, main 메서드 메뉴정리
 *  01/18 : 생성자 작성, 조회기능, 등록기능 구현
 *  01/19 : toString정의, 수정기능 구현
 *  01/20 : package 분리, 모든 필드에 private적용(필요하다면 getter/setter제작 사용), 삭제 기능 구현
 *  
 *  Student : domain에 존재
 *  StudentEx : app에 존재
 *  StudentService : service에 존재
 *  StudentUtil : utils에 존재
 */

// 기능 담당
public class StudentService {
	List<Student> students = new ArrayList<Student>();

	public StudentService() { // StudentService()를 지우면 인스턴스 초기화블럭

		String[] names = { "김경보", "김동엽", "김상현", "김승종", "김예찬", "김치형", "김태윤" };

		for (int i = 0; i < names.length; i++) {
			students.add(new Student(220000 + i + 1 + "", names[i]));
		}

		System.out.println("임시 데이터 초기화 완료");
	}




	// toString

	// 1. 조회하기
	public void list() {
		System.out.println("학번     이름     국어     영어     수학     총점     평균\r\n "
				+ "===========================================================================");
		for (int i = 0; i < students.size(); i++) {
//				
			System.out.println(students.get(i));
		}

	}

	// 2. 등록하기
	public void register() {

		students.add(new Student(nextLine("학번 >"), nextLine("이름 >"), nextInt("국어 >"), nextInt("영어 >"),
				nextInt("수학 >")));

	}

	// 3. 수정하기
	public void modify() throws RangeException {
		Student student = findBy(nextLine("수정할 학번을 입력해주세요."));
		if(student == null) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}
		student.setName(nextLine("이름 > "));
		
		
		int kor = nextInt("국어 > ");
		if(kor <0 || kor> 100) {
			throw new RangeException();
		}
		
		student.setKor(kor);
		student.setEng(nextInt("영어 > "));
		student.setMat(nextInt(" 수학> "));
	}

	// 4. 삭제하기
	public void remove() {
			students.remove(findBy(nextLine("삭제할 학번을 입력해주세요.")));
	}

	private Student findBy(String no) {
		Student student = null;
		for(Student s : students ) {
			if(s.getNo().equals(no)) {
				student = s;
			}
		}
		return student;
	}
}
