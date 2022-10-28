package com.example.madhuni.demo.controller;


import com.example.madhuni.demo.model.Payment;
import com.example.madhuni.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.net.URL;
import java.net.*;
import java.io.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    public void makePayment(@RequestBody Payment payment){

        //URL textit = new URL("http://textit.biz/sendmsg/index.php?id=94000000000&pw=0000&to=0000000000&text=Test+SMS");
         //URL url = new URL("http://www.google.com/");
        URL url;
        try {
            url = new URL("http://textit.biz/sendmsg/index.php?id=94000000000&pw=0000&to=0000000000&text=Test+SMS");
        } catch(MalformedURLException e) {
            System.out.println("The url is not well formed: ");
        }
    }


}
