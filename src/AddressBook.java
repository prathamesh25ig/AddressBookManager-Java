
import java.util.ArrayList;
import java.util.Scanner;
import com.infogalaxy.Contact;
public class AddressBook {

    public class AddressBook{
        ArrayList <Contact> contactlist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        //UC-2-Adding Multiple Contacts:
        public void addContacts(){
            Contact contact = new Contact();
            System.out.println("Enter The First Name");
            contact.setFirstName(sc.next());
            System.out.println("Enter The Last Name");
            contact.setLastname(sc.next());
            System.out.println("Enter The Address");
            contact.setAddress(sc.next());
            System.out.println("Enter The City");
            contact.setcity(sc.next());
            System.out.println("Enter The State");
            contact.setstate(sc.next());
            System.out.println("Enter The Mobile Noumber");
            contact.setmobno(sc.next());
            System.out.println("Enter The Gmail");
            contact.setemail(sc.next());
            System.out.println("Enter Zip Code");
            contact.setzip(sc.next());
            contactlist.add(contact);

        }
        public void displayContacts() {
            for(int i = 0; i < contactlist.size(); i++) {
                Contact contact = contactlist.get(i);
                System.out.println(contact.toString());
            }
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            AddressBook addressBook = new AddressBook();
            int select;
            do {
                System.out.println("Welcome to Employee Inventory Management");
                System.out.println("\n1. Add Contact \n2.Display Conatact \n3.Exit");
                System.out.println("Select Any of Your Choice:");
                select = sc.nextInt();
                switch (select) {
                    case 1:
                        addressBook.addContacts();
                        break;
                    case  2:
                        addressBook.displayContacts();
                        break;

                }
            }while (select !=3);

        }
    }