package net.chandra.bootkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BootKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootKafkaApplication.class, args);
	}

}
