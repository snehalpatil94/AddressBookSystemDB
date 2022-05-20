package com.bl.addressbookmanagementsystem;

import java.io.IOException;
import java.util.Scanner;
/**
 * Program to Read or Write the Address Book with Persons Contact into a CSV File using File IO
 *
 * @author : Snehal Patil
 */

public class AddressBookMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        AddressBookIO addressBookIO = new AddressBookIO();
        while (true) {
            System.out.println("Enter \n 1. Add new AddressBook " +
                                "\n 2. Add contact in AddressBook " +
                                "\n 3. Edit the contact in AddressBook " +
                                "\n 4. Delete the contact in AddressBook" +
                                "\n 5. Delete the AddressBook " +
                                "\n 6. Search Contact By City and State in AddressBook" +
                                "\n 7. Count Number of Contacts By City and State in AddressBook "+
                                "\n 8. Print the AddressBook" +
                                "\n 9. Print the contacts in AddressBook" +
                                "\n 10. Sort the contacts in AddressBook" +
                                "\n 11. Read and Write the contacts in Text file" +
                                "\n 12. Read and Write the contacts in CSV file " +
                                "\n 0. Exit ");

            String choice = scanner.next();
            switch (choice) {
                case "1":
                    addressBookIO.addAddressBook();
                    break;
                case "2":
                    addressBookIO.addContact();
                    break;
                case "3":
                    addressBookIO.editContactInBook();
                    break;
                case "4":
                    addressBookIO.deleteContactInBook();
                    break;
                case "5":
                    addressBookIO.deleteAddressBook();
                    break;
                case "6":
                    addressBookIO.searchContacts();
                    break;
                case "7":
                    addressBookIO.countContacts();
                    break;
                case "8":
                    addressBookIO.printBook();
                    break;
                case "9":
                    addressBookIO.printContactsInBook();
                    break;
                case "10":
                    addressBookIO.sortConacts();
                    break;
                case "11":
                    addressBookIO.readAndWriteTextFile();
                    break;
                case "12":
                    addressBookIO.readAndWriteCSVFile();
                    break;
                case "0":
                    System.out.println("Exit Application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the valid option");
            }
        }
    }
}
