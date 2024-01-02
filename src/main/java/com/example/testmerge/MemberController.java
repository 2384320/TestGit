package com.example.testmerge;

import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    public Long save(Member member) {
        return memberService.save(member);
    }
}
