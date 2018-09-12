package dao;

public class Properties {
    
    private int property_id;
    private String address;
    private String availability;
    private String accomodation_type;
    private int price_per_week;
    private String image;
    private int bedroom_no;
    
    public int getId() {
        return property_id;
    }
    public void setId(int property_id) {
        this.property_id = property_id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAvailability() {
        return availability;
    }
    public void setAvailability(String availability) {
        this.availability = availability;
    }
    
    public String getAccomodationType() {
        return accomodation_type;
    }
    public void setAccomodationType(String accomodation_type) {
        this.accomodation_type = accomodation_type;
    }
    
    public int getPricePerWeek() {
        return price_per_week;
    }
    public void setPricePerWeek(int price_per_week) {
        this.price_per_week = price_per_week;
    }
    
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public int getBedroomNo() {
        return bedroom_no;
    }
    public void setBedroomNo(int bedroom_no) {
        this.bedroom_no = bedroom_no;
    }
    
    @Override
    public String toString() {
        return "Info address [property_id:=" + property_id + ", address:=" + address + "availability:" + availability + "bedroom_no:" + bedroom_no + "accomodation_type:" + accomodation_type + "price_per_week:" + price_per_week + "image:" + image;
    }
    
    
}
