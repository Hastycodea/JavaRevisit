import java.util.ArrayList;
import java.util.List;

public class UserData {

    private List<UserDetails> userDetailsList;
    private UserDetails userDetails;

    public UserData() {
        userDetailsList = new ArrayList<>();
    }

    public void formatUserData(List<String> users) {
        for (String user : users) {
            String[] userParts = user.split(":");
            String name = userParts[0];
            String role = userParts[1];
            String id = userParts[2];

            if (userDetails.isRole(role) && userDetails.isId(id)) {
                userDetailsList.add(new UserDetails(name, role, id));
            }
            
        }
    }
}
