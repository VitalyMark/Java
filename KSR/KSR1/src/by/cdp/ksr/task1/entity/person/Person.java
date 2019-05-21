package by.cdp.ksr.task1.entity.person;

import by.cdp.ksr.task1.entity.common.Address;
import by.cdp.ksr.task1.logic.IdGenerator;


/**
 * Created by Vitali_Markusheusky on 5/14/2019.
 */
public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String mildleName;
    private Address address;


    public Person(String firstName, String lastName, String mildleName) {
        this.id = IdGenerator.getUniqueId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.mildleName = mildleName;
    }

    public Person(String firstName, String lastName) {
        this.id = IdGenerator.getUniqueId();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Address address) {
        this.id = IdGenerator.getUniqueId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Person(String firstName, String lastName, String mildleName, Address address) {
        this.id = IdGenerator.getUniqueId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.mildleName = mildleName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMildleName() {
        return mildleName;
    }

    public void setMildleName(String mildleName) {
        this.mildleName = mildleName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (!firstName.equals(person.firstName)) return false;
        if (!lastName.equals(person.lastName)) return false;
        if (mildleName != null ? !mildleName.equals(person.mildleName) : person.mildleName != null) return false;
        return address != null ? address.equals(person.address) : person.address == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + (mildleName != null ? mildleName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mildleName='" + mildleName + '\'' +
                ", address=" + address +
                '}';
    }
}
