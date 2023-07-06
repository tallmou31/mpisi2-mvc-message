package sn.esmt.mpisi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sn.esmt.mpisi2.model.Message;

@Controller
@RequestMapping("/api")
public class MessageController {

    @RequestMapping("/v1/message")
    public String getMessage(Model model) {
        model.addAttribute("message", new Message("Welcome here !"));
        return "message";
    }
}
