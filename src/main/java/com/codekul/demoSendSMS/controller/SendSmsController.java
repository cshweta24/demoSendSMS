package com.codekul.demoSendSMS.controller;


import com.codekul.demoSendSMS.SendSMS;

import com.codekul.demoSendSMS.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendSmsController
{

    @Autowired
    private SendSMS sendSms;

@PostMapping(value = "/saveData")
    public String saveData(@RequestBody User user)

{
    sendSms.sendSms(user.getNumber(),user.getMessage());
    return "success";




        
        


}




}
