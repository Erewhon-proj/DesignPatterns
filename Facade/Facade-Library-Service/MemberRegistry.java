import java.util.Arrays;
import java.util.List;

// This class simulates a member registry that contains a list of registered members.
public class MemberRegistry {

    // List of registered members
    private final List<String> registeredMembers = Arrays.asList("Frank", "Klaus", "Charlie");

    public boolean isRegisteredMember(String memberName) {
        System.out.println("MemberRegistry: Verifying registration for " + memberName);
        return registeredMembers.contains(memberName);
    }
}
