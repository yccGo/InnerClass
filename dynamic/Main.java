package cn.edu.cust.dynamic;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		RealStar realStar = new RealStar("Tom", 23);
		StarHandler handler = new StarHandler(realStar);
		
		Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] { Star.class }, handler);//��������󣬴�ϵͳĬ�ϵ�����������ӿڼ����Լ�������
		//���õķ�������ȥhandler�б���
		proxy.sing();
		proxy.bookTicket();
	}
}
