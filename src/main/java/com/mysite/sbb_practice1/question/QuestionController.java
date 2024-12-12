package com.mysite.sbb_practice1.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionController {

    @GetMapping("/question/list")
    @ResponseBody
    public String question() {
        return "question";
    }

}
