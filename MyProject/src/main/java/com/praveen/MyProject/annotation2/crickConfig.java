package com.praveen.MyProject.annotation2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.praveen.MyProject")
public class crickConfig {

	@Bean
	public static IPL ipl()
	{
		IPL i = new IPL();
		i.setEdition(17);
		i.setParticountry(10);
		i.setStartmonth("March");
		return i;
	}
	
	
	
	@Bean
	public static Cricket cricket()
	{
//		Cricket c = new Cricket();
//		c.setName("Cricket");
//		c.setGameid(2);
//		c.setCoachname("MR Ricky Pointing");
		
		
		
		Cricket cc = new Cricket("Cricket",2,"Ricky Pointing",ipl());
		return cc;
	}
}
