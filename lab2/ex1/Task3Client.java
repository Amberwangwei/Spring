package lab2.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task3Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lab2/ex1/beans-config.xml");
		Product product = context.getBean("productA",Product.class); 
		System.out.print(product);
	}

}
