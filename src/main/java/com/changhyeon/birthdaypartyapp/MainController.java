package com.changhyeon.birthdaypartyapp;

import com.changhyeon.birthdaypartyapp.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api/test")
    public TestDto main(){
        TestDto test = new TestDto();
        test.setId("1");
        test.setName("changhyeon");
        test.setBirthday("22/3/2");
        return test;
    }
}
