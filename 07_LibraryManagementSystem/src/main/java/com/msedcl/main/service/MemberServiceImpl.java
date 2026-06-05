package com.msedcl.main.service;

import org.springframework.stereotype.Service;

import com.msedcl.main.entity.Member;
import com.msedcl.main.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	private MemberRepository memberRepository;

	public MemberServiceImpl(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}

	@Override
	public Member addNewMember(Member member) {
		return memberRepository.addNewMember(member);
	}

	@Override
	public Member getMemberById(int memberId) {
		return memberRepository.getMemberById(memberId);
	}

}
