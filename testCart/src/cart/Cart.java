/**
 * @Summary   : 
 * @Package : cart
 * @FileName : Cart.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3.  
 * 
 */
package cart;

import java.util.List;

/**
 * 
 * @Package : cart
 * @FileName : Cart.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3. 
 * 
 */
public class Cart {
	private int cart_id;
	private List<Item> items;
	private String name;
	
	public Cart() {}
	public Cart(int cart_id, List<Item> items, String name) {
		super();
		this.cart_id = cart_id;
		this.items = items;
		this.name = name;
	}
	public Cart(List<Item> items, String name) {
		super();
		this.items = items;
		this.name = name;
	}
	/**
	 * @return the cart_id
	 */
	public int getCart_id() {
		return cart_id;
	}
	/**
	 * @param cart_id the cart_id to set
	 */
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
