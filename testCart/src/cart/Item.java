/**
 * @Summary   : 
 * @Package : cart
 * @FileName : Item.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3.  
 * 
 */
package cart;

/**
 * 
 * @Package : cart
 * @FileName : Item.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3. 
 * 
 */
public class Item {
	private int item_id;
	private String itemName;
	private int price;
	private int cart_id;
	
	public Item() {}
	
	public Item(String itemName, int price, int cart_id) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.cart_id = cart_id;
	}
	/**
	 * @return the item_id
	 */
	public int getItem_id() {
		return item_id;
	}
	/**
	 * @param item_id the item_id to set
	 */
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", itemName=" + itemName + ", price=" + price + ", cart_id=" + cart_id
				+ "]";
	}
	
	
}
