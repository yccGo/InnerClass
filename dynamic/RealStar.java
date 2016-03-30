package cn.edu.cust.dynamic;

public class RealStar implements Star {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sing() {
		System.out.println(this.name + " ��ʼ����");
	}

	@Override
	public void bookTicket() {
		System.out.println(this.name + " ��ʼ��Ʊ");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public RealStar(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
