package persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;
import entity.Client;
import java.util.List;

public class ClientDao{
	Session session;
	Transaction transaction;
	
	public void insert(Client c) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(c);
		transaction.commit();
		session.close();
	}	
	public void  alter(Client c) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.update(c);
		transaction.commit();
		session.close();
	}
	
	
	public void delete(Client c) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.delete(c);
		transaction.commit();
		session.close();
	}
	
	public List<Client> search() throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		List<Client> list1 = session.createQuery("FROM client").list();
		session.close();
		return list1;
	}
	
	public Client search(Integer cod){
		session = HibernateUtil.getSessionFactory().openSession();
		Client c = (Client) session.get(Client.class, cod);
		session.close();
		return c;
	}
}
