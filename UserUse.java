package jdbc.ConnSQL;

import java.sql.SQLException;

/**
 * main方法测试类
 * @author Uker
 *
 */

public class UserUse {

	public static void main(String[] args) throws SQLException {
		UserDAO dao = new UserDAO();
//		dao.Select();		//调用UserDAO类的Select()方法
//		dao.add();			//调用UserDAO类的add()方法
//		dao.delete();		//调用UserDAO类的delete()方法
		dao.update();		//调用UserDAO类的update()方法
	}
}
