package com.techtouhid.rms.controller;


import com.techtouhid.rms.dto.UserRegistrationDto;
import com.techtouhid.rms.model.User;
import com.techtouhid.rms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    private IUserService userService;


    @GetMapping("/login")
    public String login(Model model) {

        return "admin/auth/login";
    }
    @GetMapping("/index")
    public String loginIndex(Model model) {

        return "index";
    }

    @GetMapping("/register")
    public String register(Model model) {
        UserRegistrationDto userRegistrationDto = new UserRegistrationDto();
        model.addAttribute("userRegistrationDto", userRegistrationDto);

        return "admin/auth/register";
    }
    @PostMapping("/register")
    public String registerUserAccount(@Valid @ModelAttribute("userRegistrationDto") UserRegistrationDto userRegistrationDto, BindingResult result, Model model) {
        model.addAttribute("userRegistrationDto", userRegistrationDto);

        User userExists = userService.findByUsername(userRegistrationDto.getUserName());

        //System.out.println("user-->"+userRegistrationDto.getUserName());
        //System.out.println("userExists-->"+userExists);

        if (userExists != null) {
            return "redirect:/register?username";
        }
        if(result.hasErrors()){
            return "admin/auth/register";
        }
        userService.save(userRegistrationDto);
        return "redirect:/register?success";
    }

}
