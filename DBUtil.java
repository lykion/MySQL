package jdbc.ConnSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ��װ���ݿ�����
 * @author Uker
 *
 */
public class DBUtil {

	private static final String driver = "com.mysql.jdbc.Driver";					//mysql����
	private static final String url="jdbc:mysql://localhost:3306/sandytest";		//���ݿ�url
	private static final String username = "root";									//�û���
	private static final String password = "123456";								//����
	
	public static Connection conn(){
			try {
				Class.forName(driver);												//����mysql����
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(url, username, password);		//�������ݿ�
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
	}
}
