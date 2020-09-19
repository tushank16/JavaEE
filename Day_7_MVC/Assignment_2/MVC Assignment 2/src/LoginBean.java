/**
 * 
 */

/**
 * @author tushank
 *
 */
public class LoginBean {
	public static boolean validate(String login,String pass)
	{
		boolean l,p;
		l=login.isEmpty();
		p=pass.isEmpty();
		if(l == false & p == false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
