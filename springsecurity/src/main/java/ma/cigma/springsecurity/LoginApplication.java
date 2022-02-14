package ma.cigma.springsecurity;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ma.cigma.springsecurity.domaine.RoleVo;
import ma.cigma.springsecurity.domaine.UserVo;
import ma.cigma.springsecurity.service.IUserService;

@SpringBootApplication
public class LoginApplication implements CommandLineRunner {
    @Autowired
    private IUserService userService;
    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
    @Override
    public void run(String... args) throws Exception {
        userService.cleanDataBase();
        userService.save(new RoleVo("ADMIN"));
        userService.save(new RoleVo("CLIENT"));
        RoleVo roleAdmin=userService.getRoleByName("ADMIN");
        RoleVo roleClient=userService.getRoleByName("CLIENT");
        UserVo admin1=new UserVo("admin1", "admin1",Arrays.asList(roleAdmin));
        UserVo client1=new UserVo("client1","client1",Arrays.asList(roleClient));
        userService.save(admin1);
        userService.save(client1);
    }
}