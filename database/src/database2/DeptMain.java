package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		DeptMain main = new DeptMain();
		DeptDAO dao = new DeptDAO();
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			System.out.println("==============");
			System.out.println("1. 특정부서 조회");
			System.out.println("2. 전체부서 조회");
			System.out.println("3. 신규 부서 추가");
			System.out.println("4. 부서 정보 수정");
			System.out.println("5. 기존 부서 삭제");
			System.out.println("6. 종료");
			System.out.println("==============");
			System.out.print("메뉴 입력 >> ");

			int no = Integer.parseInt(sc.nextLine());

			switch (no) {
			case 1:
				System.out.print("부서번호를 입력 : ");
				int deptno = Integer.parseInt(sc.nextLine());
				DeptDTO row = dao.getRow(deptno);
				System.out.println(row);
				break;
			case 2:
				ArrayList<DeptDTO> list = dao.getRows();
				for (DeptDTO deptDTO : list) {
					System.out.print(deptDTO.getDeptno() + "\t");
					System.out.print(deptDTO.getDname() + "\t");
					System.out.println(deptDTO.getLoc());
				}
				break;
			case 3:
				DeptDTO dto = new DeptDTO();
				System.out.print("생성할 부서 번호를 입력 : ");
				dto.setDeptno(Integer.parseInt(sc.nextLine()));
				System.out.print("생성할 부서명을 입력 : ");
				dto.setDname(sc.nextLine());
				System.out.print("생성할 부서 지역을 입력 : ");
				dto.setLoc(sc.nextLine());

				System.out.println(dao.insert(dto) ? "부서 추가 성공" : "부서 추가 실패");
				break;
			case 4:
				System.out.print("수정할 부서 번호를 입력 : ");
				deptno = Integer.parseInt(sc.nextLine());
				System.out.print("원하는 동작 번호 입력\n1) 부서명 수정 2) 위치 수정 : ");
				int updateNo = Integer.parseInt(sc.nextLine());
				if (updateNo == 1) {
					System.out.print("새로운 부서명 입력 : ");
				} else if (updateNo == 2) {
					System.out.print("새로운 위치 입력 : ");
				}
				String value = sc.nextLine();
				System.out.println(dao.update(value, deptno, updateNo) ? "정보 수정 성공" : "정보 수정 실패");

				break;
			case 5:
				dto = new DeptDTO();
				System.out.print("삭제할 부서 번호를 입력 : ");
				dto.setDeptno(Integer.parseInt(sc.nextLine()));
				System.out.print("확인을 위해 부서명을 입력 : ");
				dto.setDname(sc.nextLine());
				System.out.println(dao.delete(dto) ? "부서 삭제 성공" : "부서 삭제 실패");
				break;
			case 6:
				flag = false;
				break;

			default:
				System.out.println("번호를 다시 입력해주세요");
				break;
			}

		}

	}

}
