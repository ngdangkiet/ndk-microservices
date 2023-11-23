package dev.ngdangkiet.service;

import dev.ngdangkiet.domain.notification.JsonMessage;
import dev.ngdangkiet.dto.EmailDTO;

public interface EmailService {

    void sendMail(EmailDTO email, boolean isHTML);

    void sendMail(String sendTo, String Subject, String body);

    void sendEmailWithTemplate(EmailDTO email, String templateName);

    void receiveEmailNotification(JsonMessage message);

}
