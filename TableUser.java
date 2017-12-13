package jdbc.ConnSQL;

/**
 * 定义一个实体类，与数据库中的各个字段对应
 * @author Uker
 *
 */

public class TableUser {

	private String name;
	private String sno;
	private String sex;
	private String department;
	private String address;
	private String email;
	private String tel;
	private String mark;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "[name= "+name+", sno= "+sno+", sex= "+sex+", department= "+department+", address= "+address+", email= "+email+", tel= "+tel+", mark= "+mark+"]";
	}
}
