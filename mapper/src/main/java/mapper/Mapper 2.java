package mapper;

import java.util.List;

import static java.util.stream.Collectors.toList;

class Mapper {
    public UserDto toDto(User user) {
        String email = user.getEmail();
        List<Integer> roles = user
                .getRole()
                .stream()
                .map(Roles::getPriority)
                .collect(toList());

        return new UserDto(email, roles);
    }


}
