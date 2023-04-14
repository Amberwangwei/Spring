package lab3.ex1;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task4Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab3/ex1/beans-config.xml");
		// �Цb�U��g�@�@�q�{���X�A���opooledDataSource������A
		// �æL�X���N�ݩʭȡA�H���ո�Ʈw�O�_�s�q�C
		DataSource ds = (DataSource) context.getBean("pooledDataSource");
		
		try {
			Connection c1 = (Connection) ds.getConnection();
			System.out.println(c1);
			Connection c2 = (Connection) ds.getConnection();
			System.out.println(c2);
			Connection c3 = (Connection) ds.getConnection();
			System.out.println(c3);
			Connection c4 = (Connection) ds.getConnection();
			System.out.println(c4);
			Connection c5 = (Connection) ds.getConnection();
			System.out.println(c5);
			
			c1.close();
			Connection c6 = (Connection) ds.getConnection();
			System.out.println(c6);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
