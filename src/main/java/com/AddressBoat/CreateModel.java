package com.AddressBoat;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

/**
 * Created by scbmo on 5/10/2017.
 */
public class CreateModel extends LoadableDetachableModel<Long> {

    private Long id;
    private CreateService createService;

    public CreateModel(final IModel<Contact> contactIModel){
        Form<Contact> form = new Form<Contact>("form", contactIModel){
            protected void onSubmit(){
                Contact contact = this.saveModelObject();
                System.out.println("Saving: " + contactIModel);
                createService.saveContact(contactIModel);
            }

            private Contact saveModelObject() {
                return null;
            }
        };
    }

    public CreateModel(){
        super();
        this.id = id;
        this.createService = createService;

    }

    public CreateModel(final Long contact, final CreateService createService){
        super(contact);
        this.id = contact;
        this.createService = createService;
    }


    public Long load(){
        return createService.findById(id);
    }
}
