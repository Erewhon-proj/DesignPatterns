import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//This class is responsible for managing loans of books to members
public class LoanManager {

    //String memberName, List<String> borrowedBooks
    private final Map<String, List<String>> borrowedBooks = new HashMap<>();

    //Register a loan of a book to a member
    public void registerLoan(String memberName, String bookTitle) {
        System.out.println("LoanManager: Registering loan of " + bookTitle + " to " + memberName);

        //If the member is not already in the borrowedBooks map, add them
        borrowedBooks.putIfAbsent(memberName, new ArrayList<>());

        //Add the book to the member's borrowed books
        borrowedBooks.get(memberName).add(bookTitle);
    }

     // Find the member who borrowed a book
    public String findBorrower(String bookTitle) {
        System.out.println("LoanManager: Finding who borrowed " + bookTitle);

        //Iterate through the borrowedBooks map
        for (Map.Entry<String, List<String>> entry : borrowedBooks.entrySet()) {

            //If the book is in the list of borrowed books, return the member's name
            if (entry.getValue().contains(bookTitle)) {

                //Return the member's name
                return entry.getKey();
            }
        }

        //If the book is not found, return null
        return null;
    }
}
