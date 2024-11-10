import java.util.Arrays;
import java.util.List;

// This class is responsible for checking permissions for borrowing and reading books
public class PermissionChecker {
    private final List<String> canBorrow = Arrays.asList("Frank", "Klaus");
    private final List<String> canRead = Arrays.asList("Frank", "Klaus", "Charlie");

    // Check if a member has borrow permission
    public boolean hasBorrowPermission(String memberName) {
        System.out.println("PermissionChecker: Checking borrow permission for " + memberName);
        return canBorrow.contains(memberName);
    }

    // Check if a member has read permission
    public boolean hasReadPermission(String memberName) {
        System.out.println("PermissionChecker: Checking read permission for " + memberName);
        return canRead.contains(memberName);
    }
}
