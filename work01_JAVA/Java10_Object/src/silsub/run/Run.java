package silsub.run;

import silsub.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		//1.객체 생성
		Member mem  = new Member();
		
		//2.setter로 값 변경(저장)
		mem.setMemberId("admin");
		mem.setMemberPwd("1234");
		mem.setMemberName("홍길동");
		mem.setAge(21);
		mem.setGender('남');
		mem.setPhone("01091967013");
		mem.setEmail("ktaeho14@naver.com");
		
		
		
		
		
		
		//3.getter로 값 조회
		System.out.println(mem.getMemberId());
		System.out.println(mem.getMemberPwd());
		System.out.println(mem.getMemberName());
		System.out.println(mem.getAge());
		System.out.println(mem.getGender());
		System.out.println(mem.getPhone());
		System.out.println(mem.getEmail());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
