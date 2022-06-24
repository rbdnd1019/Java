﻿package app;

import static utils.StudentUtil.*;

import exception.RangeException;
import service.StudentService;

public class StudentEx {

	public static void main(String[] args) throws RangeException {

		StudentService service = new StudentService();

		for (boolean b = true; b;) {
			try {
				int input = nextInt("1.목록 조회 2.학생 등록 3.학생 정보 수정 4. 학생 삭제 5.종료\n");

				switch (input) {
				case 1:
					service.list();
					break;
				case 2:
					service.register();
					break;
				case 3:
					service.modify();
					break;
				case 4:
					service.remove();
					break;
				case 5:
					System.out.println("종료합니다.");
					b = false;

				default:
					System.out.println("올바른 번호를 입력하세요.");
					break;
				}
			} catch (NullPointerException e) {
				System.out.println("숫자 형식으로 입력해주세요.");
			}
		}
	}
}
