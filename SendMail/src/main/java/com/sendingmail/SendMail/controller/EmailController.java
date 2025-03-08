package com.sendingmail.SendMail.controller;

import com.sendingmail.SendMail.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping("sendEmail")
    public String sendEmail() {
        sendEmailService.sendEmail("tradinge083@gmail.com","Test Body", "Test Subject");
        return "Send successfully";
    }
}
