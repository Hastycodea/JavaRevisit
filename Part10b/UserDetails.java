
public class UserDetails {
    
    private String name;
    private String role;
    private String id;
    private UserRole userRole;

    public UserDetails(String name, String role, String id) {
        this.name = name;
        this.role = role;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getId() {
        return id;
    }

    public boolean isRole(String userPosition) {
        if (UserRole.valueOf(userPosition) == userRole.ADMIN || UserRole.valueOf(userPosition) == userRole.GUEST
        || UserRole.valueOf(userPosition) == userRole.USER) {
            return true;            
        }
        return false;
    }

    public boolean isId(String idString) {
        String regex = "[0-9]{3}-[0-9]{3}";
        if (idString.matches(regex)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "User: " + getName() + " ("+getRole()+"), "+ "ID: " + getId();
    }

}
