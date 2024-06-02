package com.springcore.InjectReferenceType;

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
        ApplicationContext contxt = new ClassPathXmlApplicationContext("ReferenceConfigur.xml");
        
        A aobj = (A)contxt.getBean("a1");
        
        System.out.println(aobj.getX());
        System.out.println(aobj.getObj().getY());
    }
}