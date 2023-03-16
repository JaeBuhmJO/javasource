package ch7;

public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException | MemoryException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			deleteTempFiles();
		}

	}

	static void startInstall() throws  MemoryException, SpaceException {
		if (!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		if (!enoughSpace()) {
			throw new MemoryException("메모리가 부족합니다.");
		}

	}

	static boolean enoughSpace() {
		return false;
	}

	static boolean enoughMemory() {
		return true;
	}

	static void copyFiles() {
	}

	static void deleteTempFiles() {
	}

}
