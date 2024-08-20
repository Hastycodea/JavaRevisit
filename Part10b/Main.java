import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserData data = new UserData();

        List<String> userData = Arrays.asList(
            "Alice:ADMIN:123-456",
            "Bob:USER:789-012",
            "Charlie:GUEST:111-111",
            "Eve:UNKNOWN:123-456",
            "Mallory:ADMIN:12-34X"
        );

        data.formatUserData(userData);

        System.out.println(userData.toString());
        

    }
}