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

/**
 * @author tushank
 *
 */
@Entity
@Table(name="Product")
public class Product {
	int pid, qty;
	String pname; 
	double price;
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", qty=" + qty + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Column
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Column
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	@Column
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
