package com.msedcl.main.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.msedcl.main.entity.Employee;
import com.msedcl.main.entity.Member;

@Repository
public class MemberRepositoryImpl implements MemberRepository {
	private JdbcTemplate jdbcTemplate;

	private static final String ADD_NEW_MEMBER = "Insert into MEMBER_DETAILS(name, member_type1) values (?,?)";
	private static final String SELECT_MEMBER_BY_MEMBER_ID = "SELECT * from MEMBER_DETAILS WHERE member_code=?";

	public MemberRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Member addNewMember(Member member) {
		int rowInserted = jdbcTemplate.update(ADD_NEW_MEMBER, member.getName(), member.getType());
		if (rowInserted > 0)
			return member;
		else
			return null;
	}

	public Member getMemberById(int memberId) {
		return jdbcTemplate.queryForObject(SELECT_MEMBER_BY_MEMBER_ID,
				(rs, rw) -> new Member(rs.getInt(1), rs.getString(2), rs.getString(3)), memberId);
	}

}
