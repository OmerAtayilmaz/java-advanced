package mapper;

import java.util.List;

public class UserDto {
    public String email;
    public int pass;

    public UserDto() {
    }

    public UserDto(String email, int pass) {
        this.email = email;
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
}
