package dto;

public class Manager {
	private int num;
	private String name;
	private String job;
	private String id;
	private String password;
	
	public Manager(String id, String password, String name) {
		super();
		this.num = 0;
		this.name = name;
		this.job = "";
		this.id = id;
		this.password = password;
	}
	
	public Manager(int num, String name, String job, String id, String password) {
		super();
		this.num = num;
		this.name = name;
		this.job = job;
		this.id = id;
		this.password = password;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Manager [num=" + num + ", name=" + name + ", job=" + job + ", id=" + id + ", password=" + password
				+ "]";
	}
	
	
	
	
}