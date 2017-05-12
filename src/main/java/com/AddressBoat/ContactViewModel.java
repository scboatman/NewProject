package com.AddressBoat;

import jdk.nashorn.internal.objects.annotations.Function;
import jdk.nashorn.internal.objects.annotations.Where;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;

import java.lang.annotation.Annotation;

/**
 * Created by scbmo on 5/10/2017.
 */
public class ContactViewModel extends AbstractReadOnlyModel<String> {

    private IModel<Contact> contactModel;
    public ContactViewModel(final IModel<Contact> contactModel){
        super();
        this.contactModel = contactModel;
    }

    @Override
    public String getObject(){
        Contact contact = contactModel.getObject();
        Iterable<Contact> contacts = Iterable.transform(contact.getContacts(),
                new ContactFunction());
            return contact.getContacts();
    }

    @Override
    public void detach(){
        contactModel.detach();
    }

    private class ContactFunction implements Function<String, name>{
        public String apply(final Contact input){
            return input.getContacts();
        }

        @Override
        public String name() {
            return null;
        }

        @Override
        public int attributes() {
            return 0;
        }

        @Override
        public int arity() {
            return 0;
        }

        @Override
        public Where where() {
            return null;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return null;
        }
    }
}
