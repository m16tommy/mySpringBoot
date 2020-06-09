package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/WebApi")
public class ApiController {
	
	@RequestMapping("/Test")
    public String index() {
        return "Test";
    }
}
