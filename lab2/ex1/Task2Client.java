package lab2.ex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Task2Client {

	public static void main(String[] args) {
		ClassPathResource resourse =new ClassPathResource("lab2/ex1/beans-config.xml");
		BeanFactory bf =new XmlBeanFactory(resourse);
		Product product = (Product) bf.getBean("productA");
		System.out.println(product);
	}

}
