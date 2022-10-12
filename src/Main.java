import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, String> PhoneNumbersList = new HashMap<>();

        // använder variabeln PhoneNumberList och anropar metoden put.
        PhoneNumbersList.put("Anders"," 0763456789");
        PhoneNumbersList.put("Liza", " 0723456789");
        PhoneNumbersList.put("Amelia", " 0730493857");

        while (true){
            // här anropar jag 2 metoder för att söka efter en person samt lägga till ett nummer för en person.
            searchForNumber(scan, PhoneNumbersList);
            putNewOnList(scan, PhoneNumbersList);

        }


    }
    public static void searchForNumber(Scanner scan, Map PhoneNumbersList){

        // här har jag skapat en metod vid namn searchForNumber för att kunna söka i map efter nummer.
        System.out.println("Search for a persons number, please enter the name");
        String searchName = scan.nextLine();
        System.out.println("You search for " + searchName);
        System.out.println("This is what we found: " + PhoneNumbersList.get(searchName));

    }
    public static void putNewOnList(Scanner scan, Map PhoneNumbersList){


        // här har jag skapat en metod vid namn putNewOnList för att kunna lägga till en ny person i map = phonenumberlist.
        System.out.println("put a new name and number on the PhoneNumberList");
        System.out.println("Enter you new name ");
        String PutAnewNameOnList = scan.nextLine();
        System.out.println("Enter you number ");
        String PutNewNumberOnList = scan.nextLine();

        // här anropar vi metoden put i PhoneNumberList för att kunna lägga in det som användaren skrev.
        PhoneNumbersList.put(PutAnewNameOnList, PutNewNumberOnList);

    }






    }

