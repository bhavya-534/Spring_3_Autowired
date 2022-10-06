package com.spring.three;

import com.spring.three.repository.UserRepository;
import com.spring.three.repository.UserRepositoryImpl;
import com.spring.three.service.UserService;
import com.spring.three.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    // Add @Autowired annotation to the “setData()” method
    // Now Spring will automatically inject UserRepository into the UserService in AppConfiguration
    // we don't need to give repo argument in service method in App Configuration

    @Bean(name = "userService")
    public UserService constructorService()
    {
        return new UserServiceImpl();
    }

    @Bean(name = "userRepository")
    public UserRepository getUserRepositoryImpl()
    {
        return new UserRepositoryImpl();
    }
}
