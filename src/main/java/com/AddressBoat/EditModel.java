package com.AddressBoat;

import org.apache.wicket.model.IModel;

/**
 * Created by scbmo on 5/11/2017.
 */
public class EditModel {
    private Long Id;
    private IModel<Contact> Contact;

    public EditModel(Long id, IModel<com.AddressBoat.Contact> contact) {
        Id = id;
        Contact = contact;
    }
    public void saveEdit(){

    }
}
