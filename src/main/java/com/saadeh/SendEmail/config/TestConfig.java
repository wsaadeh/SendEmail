package com.saadeh.SendEmail.config;

import com.saadeh.SendEmail.services.EmailService;
import com.saadeh.SendEmail.services.MockEmailService;
import com.saadeh.SendEmail.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService(){
        return new MockEmailService();
    }
}
