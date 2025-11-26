package com.saadeh.SendEmail.services;

import com.saadeh.SendEmail.dto.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO dto);
}
