package jdbc.ConnSQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 用户操作数据库
 * 封装增、删、查、该
 * @author Uker
 *
 */

public class UserDAO {

	private static Connection conn = null;
	private static String sql = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	/**
	 * 查询(查)
	 * @throws SQLException
	 */
	public void Select() throws SQLException {
		conn = DBUtil.conn();					//调用DBUtil类的conn()方法
		try {
			sql = "select * from student";		//sql语句
			stmt = conn.createStatement();		//创建Statement对象
			rs = stmt.executeQuery(sql);		//创建ResultSet(结果集),并将查询结果放入ResultSet结果集中
			
			while(rs.next()) {
				System.out.println(rs.getString("姓名")+","+rs.getString("学号")+","+rs.getString("性别")+","+rs.getString("院系")+","+rs.getString("籍贯")+","+rs.getString("电子邮件")+","+
						rs.getString("联系方式")+","+rs.getString("学分"));
			}
		}catch(SQLException e) {
			System.out.println("查询失败");
			e.printStackTrace();
		}
		conn.close();
		stmt.close();
		rs.close();
	}
	
	/**
	 * 插入(增)
	 * @throws SQLException
	 */
	public void add() throws SQLException {
		conn = DBUtil.conn();
		sql = "INSERT INTO student VALUES('何丹','013','女','播音主持','新疆','test13@lykion.com','19911220000','51')";
		try {
			stmt = conn.createStatement();		//创建Statement对象
			stmt.executeLargeUpdate(sql);		//执行sql语句
			System.out.println("插入成功");
		}catch(SQLException e) {
			System.out.println("插入失败");
			e.printStackTrace();
		}
		
		conn.close();
		stmt.close();
	}
	
	/**
	 * 删除(删)
	 * @throws SQLException
	 */
	public void delete() throws SQLException {
		conn = DBUtil.conn();
		sql = "DELETE FROM student WHERE `学号` = '013'";
		try {
			stmt = conn.createStatement();
			stmt.executeLargeUpdate(sql);
			System.out.println("删除成功");
		}catch(SQLException e) {
			System.out.println("删除失败");
			e.printStackTrace();
		}
		conn.close();
		stmt.close();
	}
	
	/**
	 * 更新(改)
	 * @throws SQLException
	 */
	public void update() throws SQLException {
		conn = DBUtil.conn();
		sql = "UPDATE student SET `姓名` = '干梦冉' WHERE `学号` = '012'";
		try {
			stmt = conn.createStatement();
			stmt.executeLargeUpdate(sql);
			System.out.println("更新成功");
		}catch(SQLException e) {
			System.out.println("更新失败");
			e.printStackTrace();
		}
		conn.close();
		stmt.close();
	}
}
