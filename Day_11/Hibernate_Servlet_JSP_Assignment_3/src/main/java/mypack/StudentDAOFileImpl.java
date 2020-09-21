/**
 * 
 */
package mypack;

import java.io.*;


/**
 * @author tushank
 *
 */
public class StudentDAOFileImpl implements StudentDAO {

	public void addStudent(Student ref) {

		try
		{
			FileOutputStream FOS = new FileOutputStream("C:\\Users\\tusha\\Desktop\\JavaEE\\JavaEE\\Day_11_JavaEE\\Hibernate5__4\\Student.txt");
			ObjectOutputStream OOS = new ObjectOutputStream(FOS);
			OOS.writeObject(ref);
			OOS.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
}
