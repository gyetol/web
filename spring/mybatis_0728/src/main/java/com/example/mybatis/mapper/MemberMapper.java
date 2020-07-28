package com.example.mybatis.mapper;

import java.util.List;

import com.example.mybatis.vo.MemberVO;

public interface MemberMapper {
	MemberVO selectByEmail(String email);
	List<MemberVO> selectAll();
	MemberVO login(MemberVO member);
	void insert(MemberVO member);
	void upate(MemberVO member);
	void delete(String email);
}
