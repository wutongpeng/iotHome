package org.kilo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.kilo.iothome.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @author Œ‚Õ¨≈Ù
	 *≤‚ ‘spring hibernate
	 */
	
	public static void main(String[] args) {
		
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml,daoContext.xml");
       
        
        SessionFactory sf=(SessionFactory) ac.getBean("sessionFactory");
        Session s=sf.getCurrentSession();
        User user=new User(5,"kilo","kilo");
        Transaction tx = s.beginTransaction();
        s.save(user);
        tx.commit();
        s.close();
        sf.close();
        
       
        
	}

}
