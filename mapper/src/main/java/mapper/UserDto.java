package mapper;

import java.util.List;

public class UserDto {
    private String email;
    private int pass;
    private List<Integer> roles;

    public UserDto(String email, List<Integer> roles) {
        this.email = email;
        this.roles = roles;
    }
}
