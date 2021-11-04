package com.example.apigateway.apigateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



    @RestController
    @RequestMapping("/test")
    public class UserController {

        @GetMapping
        public String getUsers(){
            return "Service is UP";
        }
    }

