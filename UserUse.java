package jdbc.ConnSQL;

import java.sql.SQLException;

/**
 * main����������
 * @author Uker
 *
 */

public class UserUse {

	public static void main(String[] args) throws SQLException {
		UserDAO dao = new UserDAO();
//		dao.Select();		//����UserDAO���Select()����
//		dao.add();			//����UserDAO���add()����
//		dao.delete();		//����UserDAO���delete()����
		dao.update();		//����UserDAO���update()����
	}
}
