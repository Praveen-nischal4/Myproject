package com.praveen.MyProject.autowireannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.praveen.MyProject")
public class myConfig2 {

	@Bean
    public static Person person() {
        Person myP = new Person();
        myP.setMyname("Roopal");
        myP.setCity("Delhi");
        myP.setEmail("roopalgupta386@gmail.com");
        return myP;
    }

    @Bean
    public static Movies myMovies() {
        Movies m = new Movies("Koyla","Sarukhkhan", 155.65);
        return m;
    }
    
    
    
    
}
