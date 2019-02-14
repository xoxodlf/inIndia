/**
 * @Summary   : 
 * @Package : dto
 * @FileName : basketDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 26.  
 * 
 */
package dto;

/**
 * 
 * @Package : dto
 * @FileName : BasketDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 26. 
 * 
 */
public class BasketDTO {
	private int itemNo;
	private int price;
	private String name;
	private String size;
	private String image;
	private int basketNo;
	private int quantity;
	private int userNo;
	
	
	public BasketDTO(int itemNo, int price, String name, String size, String image, int basketNo, int quantity,
			int userNo) {
		super();
		this.itemNo = itemNo;
		this.price = price;
		this.name = name;
		this.size = size;
		this.image = image;
		this.basketNo = basketNo;
		this.quantity = quantity;
		this.userNo = userNo;
	}
	/**
	 * @return the itemNo
	 */
	public int getItemNo() {
		return itemNo;
	}
	/**
	 * @param itemNo the itemNo to set
	 */
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
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
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * @return the basketNo
	 */
	public int getBasketNo() {
		return basketNo;
	}
	/**
	 * @param basketNo the basketNo to set
	 */
	public void setBasketNo(int basketNo) {
		this.basketNo = basketNo;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the userNo
	 */
	public int getUserNo() {
		return userNo;
	}
	/**
	 * @param userNo the userNo to set
	 */
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "basketDTO [itemNo=" + itemNo + ", price=" + price + ", name=" + name + ", size=" + size + ", image="
				+ image + ", basketNo=" + basketNo + ", quantity=" + quantity + ", userNo=" + userNo + "]";
	}
	
	
}
