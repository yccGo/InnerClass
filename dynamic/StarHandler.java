package cn.edu.cust.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
	public RealStar realStar;

	public StarHandler(RealStar realStar) {
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Thread.sleep(1000);
		System.out.println(method.getName() + "----------����ִ��֮ǰ----------");
		if(method.getName().equals("sing")){
			System.out.println("Ҫִ�г��跽��");
		}else if(method.getName().equals("bookTicket")){
			System.out.println("Ҫִ�ж�Ʊ����");
		}
		method.invoke(realStar, args);//�����ĸ�����ķ�����ʹ����Щ����
		Thread.sleep(1000);
		System.out.println(method.getName() + "----------����ִ��֮��----------");
		return null;
	}

}
