package com.codestates.practicegithubActiondeploy.controller;

import com.codestates.practicegithubActiondeploy.entity.Member;
import com.codestates.practicegithubActiondeploy.repository.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class HelloController {

    private final MemberRepository memberRepository;

    @GetMapping("/")
    public String hello(){
        log.info("Hello Controller 출력완료 !!");
        return "Hello World! Hello BE BootCamp";
    }

    @PostMapping("/api/member")
    public ResponseEntity createMember(){

        Member member = new Member();
        member.setMemberName("이재혁");
        member.setAge(28);

        Member saveMember = memberRepository.save(member);


        return new ResponseEntity(saveMember , HttpStatus.CREATED);
    }
}
