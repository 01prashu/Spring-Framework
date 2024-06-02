package com.springcore.p_schema;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        User user1 = (User) context.getBean("User1");
        User user2 = (User) context.getBean("User2");
        User user3 = (User) context.getBean("User3");
        User user4 = (User) context.getBean("User4");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
    }
}
