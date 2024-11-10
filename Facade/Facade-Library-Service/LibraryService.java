//Facade class - Simplifies the interaction between the client and the library
public class LibraryService {

    //Instances of the classes that the LibraryService interacts with
    private final PermissionChecker permissionChecker = new PermissionChecker();
    private final MemberRegistry memberRegistry = new MemberRegistry();
    private final LoanManager loanManager = new LoanManager();

    //Borrow a book if the member is registered and has permission
    public void borrowBook(String memberName, Book book) {
        System.out.println("LibraryService: Processing borrow request for " + book.getTitle());

        //Check if the member is registered and has permission to borrow
        if (memberRegistry.isRegisteredMember(memberName) && permissionChecker.hasBorrowPermission(memberName)) {
            loanManager.registerLoan(memberName, book.getTitle());
            System.out.println("LibraryService: Borrowing successful for " + memberName);
        } else {
            System.out.println("LibraryService: Borrowing denied for " + memberName);
        }
    }

    // Check if a member can read a book based on current loans and permissions
    public void readBook(String memberName, Book book) {
        System.out.println("LibraryService: Checking read permission for " + book.getTitle());
        String borrower = loanManager.findBorrower(book.getTitle());
        if (borrower != null && borrower.equals(memberName) && permissionChecker.hasReadPermission(memberName)) {
            System.out.println("LibraryService: " + memberName + " is allowed to read " + book.getTitle());
        } else {
            System.out.println("LibraryService: Read access denied for " + memberName);
        }
    }
}
