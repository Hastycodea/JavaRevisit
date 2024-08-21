import java.util.ArrayList;
import java.util.List;

public class UserData {


    public static List<String> formatUserData(List<String> userData) {


        String regex = "[0-9]{3}-[0-9]{3}";
        List<String> results = new ArrayList<>();

        for (String user : userData) {
            String[] userParts = user.split(":");
            if (userParts.length != 3) {
                continue;
            }
            String name = userParts[0];
            String role = userParts[1];
            String id = userParts[2];

            //verifying role, and id
            try {
                UserRole userRole = UserRole.valueOf(role);
                if (id.matches(regex)) {
                    StringBuilder sb = new StringBuilder();
                    String result = sb.append("User: "+name+" (" +userRole+"), ID: "+id).toString(); 
                    results.add(result);               
                }
                
            } catch (Exception e) {
                continue;
            }
            
        }
        return results;
    }
}
