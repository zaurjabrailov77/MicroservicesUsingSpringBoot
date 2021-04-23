package az.com.developer.userservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class UserBeans {

    @Bean
   public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
