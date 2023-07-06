package sn.esmt.mpisi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sn.esmt.mpisi2.model.Message;

@Controller
@RequestMapping("/api")
public class NewMessageController {

    @RequestMapping("/{version}/message")
    public String getMessage(@PathVariable String version, Model model) {
        if(!version.equals("v1") && !version.equals("v2")) {
            model.addAttribute("errorMessage","Version non pris en compte");
            return "error";
        }
        model.addAttribute("message", new Message((version.equals("v1")) ? "Welcome here !!" : "Welcome here to new version! Enjoy."));
        return "message";
    }
}
