package application.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String loginForm(@RequestParam("error") Optional<String> error, Model ui) {
        if(error.isPresent()) {
            ui.addAttribute("error", "Usuário e/ou senha inválido(s)");
        }
        return "login";
    }
}
