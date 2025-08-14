package oops.day6.service;

import oops.day6.contact.Contact;

import java.util.List;

public class DisplayDetailsImp implements DisplayDetails {
    private final List<Contact> contactList;

    public DisplayDetailsImp(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public Contact displayByFirstName(String firstName) {
        for (Contact contact : contactList) {
            if (contact.getFirstName().equals(firstName)) {
                return contact;

            }
        }
        System.out.println("No such person not available with name of : " + firstName);
        return null;
    }

    @Override
    public void displayAllContact() {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }
}
