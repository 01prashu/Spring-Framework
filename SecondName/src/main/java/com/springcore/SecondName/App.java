package com.springcore.SecondName;

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
        ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");
        
        Employee emp = (Employee)cont.getBean("Employee1");
        System.out.println(emp);
    }
}
