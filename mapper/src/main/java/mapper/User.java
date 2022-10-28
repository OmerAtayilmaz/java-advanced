package mapper;

import java.util.List;

public class User {
    private int id;
    private int pass;
    private String email;
    private List<Roles> role;



    public User(int id, int pass, String email, List<Roles> role) {
        this.id = java.util.Objects.requireNonNull(id);
        this.pass = java.util.Objects.requireNonNull(pass);
        this.email = java.util.Objects.requireNonNullElse(email,null);
        this.role = java.util.Objects.requireNonNullElseGet(role, null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Roles> getRole() {
        return role;
    }

    public void setRole(List<Roles> role) {
        this.role = role;
    }
}
