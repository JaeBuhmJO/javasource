package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpDAO empDAO = new EmpDAO();

		boolean flag = true;

		while (flag) {
			System.out.println("-------------------------");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 삭제");
			System.out.println("3. 사원 수정");
			System.out.println("4. 사원 조회(사번)");
			System.out.println("5. 사원 조회(이름)");
			System.out.println("6. 종료");
			System.out.println("-------------------------");
			System.out.print("메뉴 >> ");
			int no = Integer.parseInt(sc.nextLine());

			switch (no) {
			case 1:
				EmpDTO empDTO = new EmpDTO();
				System.out.print("추가할 사원의 사번 입력 : ");
				empDTO.setEmpno(Integer.parseInt(sc.nextLine()));
				System.out.print("추가할 사원의 이름 입력 : ");
				empDTO.setEname(sc.nextLine());
				System.out.print("추가할 사원의 직무 입력 : ");
				empDTO.setJob(sc.nextLine());
				System.out.print("추가할 사원의 매니저 사번 입력 : ");
				empDTO.setMgr(Integer.parseInt(sc.nextLine()));
				System.out.print("추가할 사원의 연봉 입력 : ");
				empDTO.setSal(Integer.parseInt(sc.nextLine()));
				System.out.print("추가할 사원의 성과급 입력 : ");
				empDTO.setComm(Integer.parseInt(sc.nextLine()));
				System.out.print("추가할 사원의 부서번호 입력 : ");
				empDTO.setDeptno(Integer.parseInt(sc.nextLine()));

				System.out.println(empDAO.add(empDTO) ? "사원 추가 성공" : "사원 추가 실패");

				break;
			case 2:
				System.out.print("삭제할 사원의 사번 입력 : ");
				int empno = Integer.parseInt(sc.nextLine());
				System.out.println(empDAO.remove(empno) ? "사원 삭제 성공" : "사원 삭제 실패");
				break;
			case 3:
				System.out.print("수정할 사원의 사번 입력 : ");
				empno = Integer.parseInt(sc.nextLine());
				System.out.print("수정할 연봉 입력 : ");
				int sal = Integer.parseInt(sc.nextLine());
				System.out.println(empDAO.update(empno, sal) ? "연봉 수정 성공" : "연봉 수정 실패");
				break;
			case 4:
				System.out.print("조회할 사원의 사번 입력 : ");

				// 이거 null로 리턴 될 수도 있음
				EmpDTO dto = empDAO.getRow(Integer.parseInt(sc.nextLine()));
				if (dto != null) {
					System.out.println("\n****사원정보 조회****");
					System.out.println("사원번호 : " + dto.getEmpno());
					System.out.println("사원이름 : " + dto.getEname());
					System.out.println("직무 : " + dto.getJob());
					System.out.println("연봉 : " + dto.getSal());
					System.out.println("추가수당 : " + dto.getComm());
					System.out.println("부서번호 : " + dto.getDeptno());
				} else {
					System.out.println("존재하지 않는 사원 번호입니다.");
				}
				break;
			case 5:
				System.out.print("조회할 사원의 이름 입력 : ");
				ArrayList<EmpDTO> list = empDAO.getList(sc.nextLine());
				if (!list.isEmpty()) {
					System.out.println("사번\t사원명\t직무\t입사일");
					System.out.println("---------------------");
					for (EmpDTO empDTO2 : list) {
						System.out.print("사원번호 : " + empDTO2.getEmpno() + "\t");
						System.out.print("사원이름 : " + empDTO2.getEname() + "\t");
						System.out.print("직무 : " + empDTO2.getJob() + "\t");
						System.out.println("고용일 : " + empDTO2.getHiredate());

					}
				} else {
					System.out.println("존재하지 않는 사원입니다.");
				}
				break;
			case 6:
				flag = false;
				break;

			default:
				break;
			}

		}
	}

}
