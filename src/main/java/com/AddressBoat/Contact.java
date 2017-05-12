package com.AddressBoat;

import org.apache.wicket.validation.validator.EmailAddressValidator;

import java.io.Serializable;

/**
 * Created by scbmo on 5/10/2017.
 */
public class Contact implements Serializable{

    private Long    Id;
    private String  FirstName;
    private String  LastName;
    private String  StreetAddress;
    private String  City;
    private String  State;
    private String  ZipCode;
    private EmailAddressValidator Email;
    private Enum    PhoneNumber;

    public Contact(Long id, String firstName, String lastName, String streetAddress, String city, String state,String zipCode, EmailAddressValidator email, Enum phoneNumber){
        this.Id = id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.StreetAddress = streetAddress;
        this.City = city;
        this.State = state;
        this.ZipCode =zipCode;
        this.Email = email;
        this.PhoneNumber = phoneNumber;

    }

    public String getFullName(){
        return FirstName + " " + LastName;
    }

    public String getContacts() {
        return FirstName;
    }
    public Long getById(){
        return Id;
    }




}
