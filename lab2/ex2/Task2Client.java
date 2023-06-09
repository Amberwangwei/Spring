package lab2.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task2Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab2/ex2/beans-config.xml");
		
        Product productA1 =(Product) context.getBean("productA"); 
        Product productA2 =(Product) context.getBean("productA"); 
        		
        Product productB1 =(Product) context.getBean("productB");
        Product productB2 =(Product) context.getBean("productB");
        
		System.out.println("偵測productA1與productA2的記憶體位置是否相同:"+(productA1 == productA2));
		
		System.out.println("偵測productB1與productB2的記憶體位置是否相同:"+(productB1 == productB2));
		
	}

}
