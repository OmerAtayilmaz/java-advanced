package mapper;

import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class  MapperApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MapperApplication.class, args);
        List<Roles> rolesList=List.of(new Roles(1,1),new Roles(2,2),new Roles(3,3));
        User u1=new User(1,1234,"email@gmail.com",rolesList);
        User u2=new User(2,21234,"2email@gmail.com",rolesList);
        User u3=new User(3,31234,"3email@gmail.com",rolesList);
        User u4=new User(4,41234,"4email@gmail.com",rolesList);
        User u5=new User(5,51234,"5email@gmail.com",rolesList);

        List<User> userService=List.of(u1,u2,u3,u4,u5);


       final DefaultMapperFactory mapperFactory=new DefaultMapperFactory.Builder().build();
       UserDto u=mapperFactory.getMapperFacade().map(u1,UserDto.class);
        System.out.println(u.getEmail());
        System.out.println(u.getPass());
    }



}
