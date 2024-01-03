package com.example.testmerge;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository testRepository) {
        this.memberRepository = testRepository;
    }

    public Long save(Member member) {
        return memberRepository.save(member).getId();
    }

    public Member find(Long id) {
        return memberRepository.findById(id).orElse(null);
    }
}
