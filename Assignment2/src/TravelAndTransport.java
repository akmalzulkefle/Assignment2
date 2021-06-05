
public class TravelAndTransport {							
	
	private String name, address, postcode, location, website, contactNumber, fax;

	//to answer question 2.3 Encapsulation for using Setter Method
	public void setCompanyName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPosscode(String postcode) {
		this.postcode = postcode;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public void setWebsite(String website) {
		this.website = website;
	}

	//to answer question 2.3 Encapsulation for using Getter Method
    public String getCompanyName() {
	return this.name;
	}

    public String getAddress() {
	return this.address;
    }

    public String getPostcode() {
	return this.postcode;
	}

    public String getLocation() {
	return this.location;
	}

    public String getWebsite() {
	return this.website;
    }
    
    public String getContactNumber() {
	return this.contactNumber;
    }

    public String getFax() {
	return this.fax;
    }

}