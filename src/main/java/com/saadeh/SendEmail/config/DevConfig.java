package com.saadeh.SendEmail.config;

import com.saadeh.SendEmail.services.EmailService;
import com.saadeh.SendEmail.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    public EmailService emailService(){
        return new SendGridEmailService();
    }
}
