package com.example.securitybasic.controller;

import com.example.securitybasic.service.JoinService;
import com.example.securitybasic.dto.JoinDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @GetMapping("/join")
    public String joinPage() {

        return "join";
    }

    @PostMapping("/joinProcess")
    public String joinProcess(JoinDto joinDto) {

        System.out.println(joinDto.getUsername());

        joinService.joinProcess(joinDto);


        return "redirect:/login";
    }

}
