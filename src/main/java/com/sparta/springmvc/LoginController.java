package com.sparta.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping
public class LoginController {

  @GetMapping("/login")
    public String login(){
        return "redirect:/login-form.html";
    }
  @PostMapping("/login")
    public String postlogin(Model model, @RequestParam String id, @RequestParam String password){
      if(id.equals(password)) {
        model.addAttribute("loginId", id);
      }
      return "login-result";
  }

}
