package oops.day6.service;

import oops.day6.contact.Contact;

public interface DisplayDetails {
    Contact displayByFirstName(String name);

    void displayAllContact();

}
