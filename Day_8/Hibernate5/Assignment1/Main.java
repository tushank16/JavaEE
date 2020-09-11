package mypack;

import org.hibernate.Session;
import org.hibernate.Transaction;




public class Main 
{

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction transaction = null; 
        try { 
        	transaction = session.beginTransaction(); 
            Student s1=new Student();
            s1.setAge(23);
            s1.setName("Tushank");
            s1.setAddress("Dadar");
            
            Student s2=new Student();
            s2.setAge(60);
            s2.setName("ojas");
            s2.setAddress("kandivali");
            
            Student s3=new Student();
            s3.setAge(25);
            s3.setName("shriraj");
            s3.setAddress("chiplun");
            
            session.save(s1);
            session.save(s2);
            session.save(s3);

            transaction.commit(); 
            System.out.println("Added all entried of Student");  
             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}








