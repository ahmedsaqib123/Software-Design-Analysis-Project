

public class Property {

	/**
	 * 
	 */
	private Integer Property_id;
	/**
	 * 
	 */
	private Integer Price;
	/**
	 * 
	 */
	private Integer size;
	/**
	 * 
	 */
	private EString description;
	/**
	 * Getter of Property_id
	 */
	public Integer getProperty_id() {
	 	 return Property_id; 
	}
	/**
	 * Setter of Property_id
	 */
	public void setProperty_id(Integer Property_id) { 
		 this.Property_id = Property_id; 
	}
	/**
	 * Getter of Price
	 */
	public Integer getPrice() {
	 	 return Price; 
	}
	/**
	 * Setter of Price
	 */
	public void setPrice(Integer Price) { 
		 this.Price = Price; 
	}
	/**
	 * Getter of size
	 */
	public Integer getSize() {
	 	 return size; 
	}
	/**
	 * Setter of size
	 */
	public void setSize(Integer size) { 
		 this.size = size; 
	}
	/**
	 * Getter of description
	 */
	public EString getDescription() {
	 	 return description; 
	}
	/**
	 * Setter of description
	 */
	public void setDescription(EString description) { 
		 this.description = description; 
	}
	/**
	 * 
	 * @param description 
	 * @param propertyId 
	 * @param size 
	 * @param seller 
	 * @param Price 
	 */
	public void editPropertyDetails(String description, Integer propertyId, Integer size, seller seller, Integer Price) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param propertyId 
	 */
	public void viewProperty(Integer propertyId) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param description 
	 * @param seller 
	 * @param price 
	 * @param size 
	 */
	public void addProperty(String description, seller seller, Integer price, Integer size) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param PropertyId 
	 */
	public void removeProperty(Integer PropertyId) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param property_object 
	 * @param buyer 
	 */
	public void bookProperty(BookedProperty property_object, buyer buyer) { 
		// TODO Auto-generated method
	 } 

}