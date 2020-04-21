import java.util.Date;

import org.hibernate.Session;

import com.rtpl.user.DBUser;
import com.rtpl.util.HibernateUtil;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		DBUser user = new DBUser();

		user.setUserId(1);
		user.setUsername("neha");
		user.setCreatedBy("tyagi");
		user.setCreatedDate(new Date());

		session.save(user);
		session.getTransaction().commit();
	}
}
