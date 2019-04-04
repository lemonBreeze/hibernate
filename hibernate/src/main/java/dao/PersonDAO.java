package dao;

import Classes.HibernateUtil;
import Classes.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonDAO
{
    public void createPerson(Person p)
    {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(p);
        transaction.commit();
    }
}
