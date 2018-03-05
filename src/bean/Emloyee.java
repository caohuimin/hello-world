package bean;


public class Emloyee {
     private int id;
     private String username;
     private int age;
     private String sex;
     private String title;  //÷∞≥∆
     private String section;  //≤ø√≈
     private int salary;
     
     public Emloyee(){
    	 super();
     }
     
     public Emloyee(int id,String username,int age,String sex,String title,String section,int salary){
    	 super();
    	 this.id = id;
    	 this.username = username;
    	 this.age = age;
    	 this.sex = sex;
    	 this.title = title;
    	 this.section = section;
    	 this.salary = salary;
     }
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
     
     
}
