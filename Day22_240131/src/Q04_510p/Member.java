package Q04_510p;

public class Member {
	private String id;
	private String name;
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}
	
	
}
