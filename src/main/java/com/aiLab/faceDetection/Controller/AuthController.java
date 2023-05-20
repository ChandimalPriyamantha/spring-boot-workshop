package com.aiLab.faceDetection.Controller;


import com.aiLab.faceDetection.HttpEntities.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
public class AuthController {

    @RequestMapping(method =  RequestMethod.GET, path="/lang/{language}/login")
    public ResponseEntity<String> doLogin(@PathVariable String language, @RequestBody LoginRequest loginData){

        if(Objects.equals(loginData.getEmail(), "okchandiuse@gmail.com") && Objects.equals(loginData.getPassword(), "1234")){

            return  ResponseEntity.ok("Success..!");
        }
           return  ResponseEntity.ok("Not Success..!");
    }
}
