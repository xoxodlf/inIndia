/**
 * @Summary   : 
 * @Package : dto
 * @FileName : ItemDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 25.  
 * 
 */
package dto;

/**
 * 
 * @Package : dto
 * @FileName : ItemDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 25. 
 * 
 */
public class ItemDTO {
	private int itemNo;
	private int price;
	private String name;
	private String size;
	private String image;
	
	public  ItemDTO() {}
	
	public ItemDTO(int itemNo, int price, String name, String size, String image) {
		super();
		this.itemNo = itemNo;
		this.price = price;
		this.name = name;
		this.size = size;
		this.image = image;
	}
	
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemDTO [itemNo=" + itemNo + ", price=" + price + ", name=" + name + ", size=" + size + ", image="
				+ image + "]";
	}
	
	
}
