package com.kolodenko.simple_boot_name;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @RequestMapping("name")
    public String getName(){
        return "Vitalii";
    }
}
