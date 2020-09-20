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

	int pid, qty, price;
	String pname;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pid")
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Product() {
	}
	@Override
	public String toString() {
		return "Product Details :-  ProductId (pid)=" + pid + ", Quantity = " + qty + ", Price = " + price + ", ProductName (pname)=" + pname;
	}
	
}
