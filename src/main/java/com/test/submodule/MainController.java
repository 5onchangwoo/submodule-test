package com.test.submodule;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {



    @GetMapping(value = {"/", "/main"})
    public String main() {
        return "index";
    }

    @GetMapping(value = "test")
    @ResponseBody
    public ResponseEntity<ResponseDTO> testController(@Value("${test}") String testConfig) {

        return ResponseEntity.status(HttpStatus.OK).body(new ResponseDTO(testConfig));
    }


}
