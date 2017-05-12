package com.AddressBoat;

import org.apache.wicket.model.IModel;

/**
 * Created by scbmo on 5/10/2017.
 */
public class CreateService {
    public static CreateService ourInstance = new CreateService();

    public static CreateService getInstance() {
        return ourInstance;
    }

    private CreateService() {
    }

    public Long findById(Long id) { return id;
    }

    public void saveContact(IModel<Contact> contactIModel) {
    }
}
