package jdbc.ConnSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 封装数据库连接
 * @author Uker
 *
 */
public class DBUtil {

	private static final String driver = "com.mysql.jdbc.Driver";					//mysql驱动
	private static final String url="jdbc:mysql://localhost:3306/sandytest";		//数据库url
	private static final String username = "root";									//用户名
	private static final String password = "123456";								//密码
	
	public static Connection conn(){
			try {
				Class.forName(driver);												//加载mysql驱动
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(url, username, password);		//连接数据库
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
	}
}
