package abstr;

import interf.DataAccessObject;
import interf.Mysql;
import interf.OracleDao;

public class DaoEx {

	public static void main(String[] args) {
		OracleDao oracle = new OracleDao();
		DataAccessObject oracle2 = new OracleDao();
		dbWork(oracle);
		dbWork(oracle2);
		
		Mysql mysql = new Mysql();
		dbWork(mysql);
		
	}
	
	static void dbWork(DataAccessObject k) {
		k.select();
		k.insert();
		k.update();
		k.delete();
	}

}
