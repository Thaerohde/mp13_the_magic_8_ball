package refugeescode.at.mp13_the_magic_8_ball.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Controller
@RequestMapping("/")
public class ApplicationController {

    @ModelAttribute("random_message")
    String companyName() {
        return getRandomString();
    }

    private String getRandomString() {
        String[] random = {"My name is thaer", "You are a superman", "You are Spiderman", "How are you!!"};
        Random r = new Random();
        int ranNum = r.nextInt(random.length);
        return random[ranNum];
    }

    @GetMapping
    String page(Model model) {

        return "Random";

    }
}