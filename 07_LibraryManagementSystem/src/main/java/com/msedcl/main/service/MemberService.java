package com.msedcl.main.service;

import com.msedcl.main.entity.Member;

public interface MemberService {
	
	Member addNewMember(Member member);

	Member getMemberById(int memberId);


}
