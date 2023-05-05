package ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
	
	
	@Bean
	@Scope("prototype")
	private Department department(){
		return  new Department();
		
	}

}
