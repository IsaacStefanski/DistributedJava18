package edu.wctc.dj.week4.model;

/**
 *
 * @author Isaac
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String streetAddress;
    private String city;
    private String state;
    private int zip;
    private String cardNumber;
    private String cardExpirationDate;
    private int cardSecurityCode;
    private Cart cart;

    public Customer(String firstName, String lastName, String email, String streetAddress,
            String city, String state, int zip, String cardNumber, String cardExpirationDate,
            int cardSecurityCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.cardNumber = cardNumber;
        this.cardExpirationDate = cardExpirationDate;
        this.cardSecurityCode = cardSecurityCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public int getCardSecurityCode() {
        return cardSecurityCode;
    }

    public void setCardSecurityCode(int cardSecurityCode) {
        this.cardSecurityCode = cardSecurityCode;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}