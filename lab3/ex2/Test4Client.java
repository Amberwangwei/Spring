package lab3.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class Test4Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab3/ex2/beans-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		// 在下面加入程式碼
		Product p =new Product();
		p.setName("dog2");
		p.setDescription("dog no.2");
		int key =productDao.insert(p);
		System.out.println(key);
	}

}
