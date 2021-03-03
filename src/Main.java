import service.EventService;
import service.IEventService;
import service.IMemberService;
import service.MemberService;

public class Main {

	public static void main(String[] args) {
		IEventService service = new EventService();
		IMemberService mService = new MemberService();
		
		System.out.println("이벤트 추가하기");
		service.showInsertEvent("새로운 이벤트","다음주");
		
		System.out.println("전체 이벤트 갯수");
		service.showTotalEvent();
		
		System.out.println("회원 저장");
		mService.insertMember("newFace", 20);
		
		System.out.println("총 회원수 보기");
		mService.showMemberNum();
		
	}

}
