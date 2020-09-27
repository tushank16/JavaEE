/**
 * 
 */
package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author tusha
 *
 */
@Entity
@Table(name="Login")
public class Login {
	private int id;
	private String uname,password;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@NotEmpty(message="name can not be empty")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "name must contain characters")
	@Size(max = 6)
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}

	@NotEmpty(message="password can not be empty")
	@Pattern(regexp = "^[A-Za-z]+[0-9]+$", message = "password must contain characters as well as digits")
	@Size(min=4,max = 7)	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Login [id=" + id + ", uname=" + uname + ", password=" + password + "]";
	}
	
}
