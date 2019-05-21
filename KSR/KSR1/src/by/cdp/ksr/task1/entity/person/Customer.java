package by.cdp.ksr.task1.entity.person;

import by.cdp.ksr.task1.entity.common.Address;

/**
 * Created by Vitali_Markusheusky on 5/14/2019.
 */
    public class Customer extends Person {

    private long creditCardNumber;
    private long account;

    public Customer(String firstName, String lastName, String mildleName, long account) {
        super(firstName, lastName, mildleName);
        this.account = account;
    }

    public Customer(String firstName, String lastName, long account) {
        super(firstName, lastName);
        this.account = account;
    }

    public Customer(String firstName, String lastName, Address address, long account) {
        super(firstName, lastName, address);
        this.account = account;
    }

    public Customer(String firstName, String lastName, String mildleName, Address address, long account) {
        super(firstName, lastName, mildleName, address);
        this.account = account;
    }

    public Customer(String firstName, String lastName, String mildleName, long creditCardNumber, long account) {
        super(firstName, lastName, mildleName);
        this.creditCardNumber = creditCardNumber;
        this.account = account;
    }

    public Customer(String firstName, String lastName, long creditCardNumber, long account) {
        super(firstName, lastName);
        this.creditCardNumber = creditCardNumber;
        this.account = account;
    }

    public Customer(String firstName, String lastName, Address address, long creditCardNumber, long account) {
        super(firstName, lastName, address);
        this.creditCardNumber = creditCardNumber;
        this.account = account;
    }

    public Customer(String firstName, String lastName, String mildleName, Address address, long creditCardNumber, long account) {
        super(firstName, lastName, mildleName, address);
        this.creditCardNumber = creditCardNumber;
        this.account = account;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Customer customer = (Customer) o;

        if (creditCardNumber != customer.creditCardNumber) return false;
        return account == customer.account;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (creditCardNumber ^ (creditCardNumber >>> 32));
        result = 31 * result + (int) (account ^ (account >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "creditCardNumber=" + creditCardNumber +
                ", account=" + account +
                '}';
    }
}


