package com.springcore.InjectCollection;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/InjectCollection/config.xml");
        User user1 = (User)context.getBean("User1");
        
        System.out.println(user1);
    }
}
