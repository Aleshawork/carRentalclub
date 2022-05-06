package service.work.carrentalclub.remote;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import service.work.carrentalclub.model.Role;
import service.work.carrentalclub.model.User;

import java.util.Arrays;
import java.util.Set;

@Configuration
public class TestConfig {

    @Bean
    public UserDetailsService fakeUserDetailsService() {
        User user = new User();
        user.setUsername("Test");
        user.setEmail("test@mail.ru");
        user.setPassword("password");
        user.setFullName("Test Test");
        user.setRoles(Set.of(Role.ADMIN));
        user.setPassword("1234");

        return new InMemoryUserDetailsManager(Arrays.asList(user));
    }
}
