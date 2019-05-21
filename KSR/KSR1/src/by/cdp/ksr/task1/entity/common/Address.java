package by.cdp.ksr.task1.entity.common;

/**
 * Created by Vitali_Markusheusky on 5/16/2019.
 */
public class Address {
    private String country;
    private String city;
    private String street;
    private int houseNumber;
    private int housing;
    private int flatNumber;

    public Address(String country, String city, String street, int houseNumber, int housing, int flatNumber){
        this.city=city;
        this.country =country;
        this.street=street;
        this.houseNumber=houseNumber;
        this.housing=housing;
        this.flatNumber=flatNumber;
    }

    public Address(String country, String city, String street, int houseNumber, int flatNumber){
        this.city=city;
        this.country =country;
        this.street=street;
        this.houseNumber=houseNumber;
        this.flatNumber=flatNumber;
    }

    public Address(String country, String city, String street, int houseNumber){
        this.city=city;
        this.country =country;
        this.street=street;
        this.houseNumber=houseNumber;
    }

    public Address(String country, String city, int houseNumber){
        this.city=city;
        this.country =country;
        this.houseNumber=houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getHousing() {
        return housing;
    }

    public void setHousing(int housing) {
        this.housing = housing;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (houseNumber != address.houseNumber) return false;
        if (housing != address.housing) return false;
        if (flatNumber != address.flatNumber) return false;
        if (!country.equals(address.country)) return false;
        if (!city.equals(address.city)) return false;
        return street != null ? street.equals(address.street) : address.street == null;
    }

    @Override
    public int hashCode() {
        int result = country.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + houseNumber;
        result = 31 * result + housing;
        result = 31 * result + flatNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", housing=" + housing +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
