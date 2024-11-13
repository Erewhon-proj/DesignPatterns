public class Client {
    public static void main(String[] args) {

        // Create a LibraryService instance
        LibraryService libraryService = new LibraryService();

        // Create some books
        Book book1 = new Book("Animal Farm");
        Book book2 = new Book("1984");

        // Example interactions using the LibraryService (Facade)
        String memberName1 = "Klaus";
        String memberName2 = "Charlie";

        // Borrow books example 1
        System.out.printf("%nClient: Requesting to borrow '%s' by %s%n", book1.getTitle(), memberName1);
        libraryService.borrowBook(memberName1, book1);

        // Borrow books example 2
        System.out.printf("%nClient: Requesting to borrow '%s' by %s%n", book2.getTitle(), memberName2);
        libraryService.borrowBook(memberName2, book2);

        // Read books example
        System.out.printf("%nClient: Requesting to read '%s' by %s%n", book1.getTitle(), memberName2);
        libraryService.readBook(memberName2, book1);

    }

}
