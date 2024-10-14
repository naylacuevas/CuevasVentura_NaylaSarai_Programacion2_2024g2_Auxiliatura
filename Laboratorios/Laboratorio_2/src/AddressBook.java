import java.io.*;
import java.util.HashMap;

public class AddressBook {
    private HashMap<String, Contact> contacts;
    private static final String FILE_NAME = "contacts.dat";

    public AddressBook() {
        this.contacts = new HashMap<>();
        loadContacts(); // Cargar contactos existentes
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getEmail())) {
            System.out.println("A contact with this email already exists.");
        } else {
            contacts.put(contact.getEmail(), contact);
            System.out.println("Contact added successfully.");
            storeContacts(); // Guardar contactos después de agregar
        }
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("The address book is empty.");
            return;
        }
        for (Contact contact : this.contacts.values()) {
            System.out.println(contact);
        }
    }

    public void searchContact(String email) {
        if (contacts.containsKey(email)) {
            System.out.println(contacts.get(email));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String email) {
        if (contacts.containsKey(email)) {
            contacts.remove(email);
            System.out.println("Contact deleted.");
            storeContacts(); // Guardar contactos después de borrar
        } else {
            System.out.println("No contact found with the provided email.");
        }
    }

    public void storeContacts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(contacts);
            System.out.println("Contacts stored successfully.");
        } catch (IOException e) {
            System.err.println("Error storing contacts: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadContacts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            contacts = (HashMap<String, Contact>) ois.readObject();
            System.out.println("Contacts loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading contacts: " + e.getMessage());
        }
    }
}