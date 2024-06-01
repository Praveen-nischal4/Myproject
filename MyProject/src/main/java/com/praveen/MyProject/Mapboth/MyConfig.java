package com.praveen.MyProject.Mapboth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.praveen.MyProject")
public class MyConfig {

	
	 @Bean
	    public Vehicle myVehicle() {
	        Vehicle v = new Vehicle();
	        v.setChno("JFD$%SW");
	        v.setColor("Black");
	        v.setType("@ Weehler");
	        v.setBikePrice(myBikePrice());
	        return v;
	    }

	    @Bean
	    public Map<Bike, Price> myBikePrice() {
	        Map<Bike, Price> myBikePrice = new HashMap<Bike,Price>();
	        myBikePrice.put(myBike(), myPrice());
	        return myBikePrice;
	    }

	    @Bean
	    public Price myPrice() {
	        Price p = new Price();
	        p.setPrice(32560.25);
	        return p;
	    }

	    @Bean
	    public Bike myBike() {
	        Bike b = new Bike();
	        b.setLisenceno("A234FGr");
	        b.setModel("Yamaha R15");
	        return b;
	    }
	
}
