/**
 * @Summary   : 
 * @Package : d2
 * @FileName : product.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 3.  
 * 
 */
package d2;

import java.util.Date;

/**
 * 
 * @Package : d2
 * @FileName : product.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 3. 
 * 
 */
public class product {
	private int Product_Id;
	private String Product_name;
	private Date Expiry_Date;
	private double rate;
	public int getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(int product_Id) {
		Product_Id = product_Id;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public Date getExpiry_Date() {
		return Expiry_Date;
	}
	public void setExpiry_Date(Date expiry_Date) {
		Expiry_Date = expiry_Date;
	}
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "product [Product_Id=" + Product_Id + ", Product_name=" + Product_name + ", Expiry_Date=" + Expiry_Date
				+ ", rate=" + rate + "]";
	}
	
}
