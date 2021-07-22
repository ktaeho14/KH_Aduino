package silsub1.run;

import silsub1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member m = new Member();
		m.setAge(1);
		m.setEmail("ktaeho14@naver.com");
		m.setGender('남');
		m.setMemberId("sooho");
		m.setMemberName("김수호");
		m.setMemberPwd("fkvltm12");
		m.setPhone("01091967013");
		
		System.out.println("Member의 나이 : " + m.getAge());
		System.out.println("Member의 이메일 : " +m.getEmail());
		System.out.println("Member의 성별 : " +m.getGender());
		System.out.println("Member의 아이디 : " +m.getMemberId());
		System.out.println("Member의 이름 : " +m.getMemberName());
		System.out.println("Member의 비밀번호 : " +m.getMemberPwd());
		System.out.println("Member의 번호 : " +m.getPhone());
	
	
	
	
	
	
	
	
	
	}

}
