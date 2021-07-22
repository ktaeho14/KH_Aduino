package silsub.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	public  Member() {
		
	}
	
	
	
	
	//setter method
		//필드 값 변경을 위해 사용하는 메소드
		
	
	//setter 메소드는 매개변수를 이용하여 필드에 값을 저장하겠다!라고생각
	
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		
		public void setMemberPwd(String memberPwd) {
			this.memberPwd = memberPwd;
		}
		
		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public void setPhone(String phone) {
			this.phone=phone;
		}
		public void setEmail(String email) {
			this.email=email;
		}
		
		
		
		
		
		//getter메소드는 어떻게 리턴을 받겠다 라고 생각하자
		
		
	//getter method
		//필드값을 확인하기 위해 사용하는 메소드
	public String getMemberId() {
		return memberId;
	}
	
	public String getMemberPwd() {
		return memberPwd;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	
	
	
	
	
	
}
