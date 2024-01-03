package com.example.testmerge;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class MemberRepositoryTest {

    @Autowired
    MemberService memberService;

    @Test
    public void testMember() {
        // given  
        Member member = new Member();
        member.setName("memberA");

        // when  
        Long savedId = memberService.save(member);
        Member findMember = memberService.find(savedId);

        // then  
        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
        Assertions.assertThat(findMember.getName()).isEqualTo(findMember.getName());
    }
}