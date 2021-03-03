package service;

import java.util.ArrayList;

import model.MemberVO;

public class MemberService implements IMemberService{
	ArrayList<MemberVO> list = new ArrayList<>();
	
	public MemberService() {
		MemberVO vo = new MemberVO();
		vo.setName("oldFace");
		vo.setAge(21);
		list.add(vo);
	}
	
	@Override
	public void insertMember(String name, int age) {
		MemberVO member = new MemberVO();
		member.setName(name);
		member.setAge(age);
		list.add(member);
	}

	@Override
	public void showMemberNum() {
		// TODO Auto-generated method stub
		
	}

}
