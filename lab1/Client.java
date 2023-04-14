package lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	private static final int INTPUT1 =3;
	private static final int INTPUT2 =6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new ClassPathXmlApplicationContext("beans-config.xml");
		Calculator calculator = (Calculator) container.getBean("calculator");
		System.out.println(INTPUT1+calculator.getSymbol()+INTPUT2+"="+calculator.calculator(INTPUT1,INTPUT2));
	}

}
