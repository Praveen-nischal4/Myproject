package com.praveen.MyProject;

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
        ApplicationContext context = new AnnotationConfigApplicationContext(StuConfi.class);
        
        Student st = context.getBean("myStudent",Student.class);
        System.out.println(st);
        st.printDetail();
    }
}
