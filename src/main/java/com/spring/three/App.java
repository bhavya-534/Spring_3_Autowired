package com.spring.three;

import com.spring.three.model.User;
import com.spring.three.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Entry point
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        UserService service = context.getBean("userService", UserService.class);

        //service.manipulateData() - method calling
        User user = service.manipulateData().get(1);
        System.out.println("Keep Smile...'" +user.getFirstName()+"' ");

    }
}
