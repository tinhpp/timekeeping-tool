package org.spring.timekeeping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableTransactionManagement
@SpringBootApplication
@CrossOrigin
public class TimekeepingToolApplication {

//	@Bean
//	public ModelMapper modelMapper() {
//		ModelMapper modelMapper = new ModelMapper();
//        modelMapper.getConfiguration()
//        .setMatchingStrategy(MatchingStrategies.STRICT);
//		return modelMapper;
//	}

	public static void main(String[] args) {
		SpringApplication.run(TimekeepingToolApplication.class, args);
	}

}
