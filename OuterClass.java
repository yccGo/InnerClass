package cn.edu.cust.innerClass;

public class OuterClass {
	public static int num = 123;
	public String str = "hello world";

	public void show() {
		System.out.println("OuterClass show()");
	}
	
	public static void hello() {
		System.out.println("hello");
	}

	public static class InnerClass {
		// ��̬�ڲ����мȿ����о�̬��Ա��Ҳ�����зǾ�̬��Ա
		public static int num2 = 345;
		public String str2 = "I LOVE U";

		public void show2() {
			System.out.println(num);//�����ⲿ��ľ�̬����
			// System.out.println(str); //���ܵ����ⲿ��ķǾ�̬��Ա
		}

		public static void hello2() {
			System.out.println("hello2");//�����ⲿ��ľ�̬����
			hello();
		}
	}
	public static void main(String[] args) {
		OuterClass.InnerClass inner = new OuterClass.InnerClass();//����
		inner.hello2();
		inner.show2();
		InnerClass inner2 = new InnerClass();//�ɶ�������
		inner2.hello2();
		
	}
}
