package oops.day6.service;

import oops.day6.contact.Contact;

import java.util.List;
import java.util.Scanner;

public class ModifyPersonDetailsClass implements ModifyPersonDetails {
    Scanner scan = new Scanner(System.in);
    private final List<Contact> contactList;

    public ModifyPersonDetailsClass(List<Contact> contactList) {
        this.contactList = contactList;
    }



    @Override
    public boolean updatePerson(String firstName) {
        Contact person = new Contact();
        System.out.println("Enter person Last Name: ");
        person.setLastName(scan.next());
        System.out.println("Enter person city : ");
        person.setCity(scan.next());
        System.out.println("Enter person state Name: ");
        person.setState(scan.next());
        System.out.println("Enter person Address Name: ");
        person.setAddress(scan.next());
        System.out.println("Enter person Zip code: ");
        person.setZipCode(scan.nextInt());
        System.out.println("Enter person Phone number : ");
        person.setPhoneNumber(scan.nextLong());
        System.out.println("Enter person email : ");
        person.setEmail(scan.next());
        int index = 0;
        for (Contact contact : contactList) {
            if (contact.getFirstName().equals(firstName)) {

                contactList.set(index, person);
                return true;
            }
            index++;
        }
        return false;
    }
}
