package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		DeptDao dao = new DeptDao();
		Scanner scanner = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			System.out.println("==============");
			System.out.println("1. 특정부서 조회");
			System.out.println("2. 전체부서 조회");
			System.out.println("6. 종료");
			System.out.println("==============");
			System.out.print("메뉴 입력 >> ");

			int no = Integer.parseInt(scanner.nextLine());

			switch (no) {
			case 1:
				System.out.print("부서번호를 입력 : ");
				int deptno = Integer.parseInt(scanner.nextLine());
				DeptDTO row = dao.getRow(deptno);
				System.out.println(row);
				break;
			case 2:
				ArrayList<DeptDTO> list = dao.getRows();
				for (DeptDTO deptDTO : list) {
					System.out.print(deptDTO.getDeptno()+"\t");
					System.out.print(deptDTO.getDname()+"\t");
					System.out.println(deptDTO.getLoc());
				}
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
