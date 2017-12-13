package jdbc.ConnSQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * �û��������ݿ�
 * ��װ����ɾ���顢��
 * @author Uker
 *
 */

public class UserDAO {

	private static Connection conn = null;
	private static String sql = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	/**
	 * ��ѯ(��)
	 * @throws SQLException
	 */
	public void Select() throws SQLException {
		conn = DBUtil.conn();					//����DBUtil���conn()����
		try {
			sql = "select * from student";		//sql���
			stmt = conn.createStatement();		//����Statement����
			rs = stmt.executeQuery(sql);		//����ResultSet(�����),������ѯ�������ResultSet�������
			
			while(rs.next()) {
				System.out.println(rs.getString("����")+","+rs.getString("ѧ��")+","+rs.getString("�Ա�")+","+rs.getString("Ժϵ")+","+rs.getString("����")+","+rs.getString("�����ʼ�")+","+
						rs.getString("��ϵ��ʽ")+","+rs.getString("ѧ��"));
			}
		}catch(SQLException e) {
			System.out.println("��ѯʧ��");
			e.printStackTrace();
		}
		conn.close();
		stmt.close();
		rs.close();
	}
	
	/**
	 * ����(��)
	 * @throws SQLException
	 */
	public void add() throws SQLException {
		conn = DBUtil.conn();
		sql = "INSERT INTO student VALUES('�ε�','013','Ů','��������','�½�','test13@lykion.com','19911220000','51')";
		try {
			stmt = conn.createStatement();		//����Statement����
			stmt.executeLargeUpdate(sql);		//ִ��sql���
			System.out.println("����ɹ�");
		}catch(SQLException e) {
			System.out.println("����ʧ��");
			e.printStackTrace();
		}
		
		conn.close();
		stmt.close();
	}
	
	/**
	 * ɾ��(ɾ)
	 * @throws SQLException
	 */
	public void delete() throws SQLException {
		conn = DBUtil.conn();
		sql = "DELETE FROM student WHERE `ѧ��` = '013'";
		try {
			stmt = conn.createStatement();
			stmt.executeLargeUpdate(sql);
			System.out.println("ɾ���ɹ�");
		}catch(SQLException e) {
			System.out.println("ɾ��ʧ��");
			e.printStackTrace();
		}
		conn.close();
		stmt.close();
	}
	
	/**
	 * ����(��)
	 * @throws SQLException
	 */
	public void update() throws SQLException {
		conn = DBUtil.conn();
		sql = "UPDATE student SET `����` = '����Ƚ' WHERE `ѧ��` = '012'";
		try {
			stmt = conn.createStatement();
			stmt.executeLargeUpdate(sql);
			System.out.println("���³ɹ�");
		}catch(SQLException e) {
			System.out.println("����ʧ��");
			e.printStackTrace();
		}
		conn.close();
		stmt.close();
	}
}
