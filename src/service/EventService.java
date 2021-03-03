package service;

import java.util.HashMap;

public class EventService implements IEventService{

	HashMap<String,String> map = new HashMap<>();
	public EventService() {
		map.put("첫번째 이벤트", "이번달");
		map.put("두번째 이벤트", "다음달");
		map.put("세번째 이벤트", "이번달");
	}
	
	@Override
	public void showInsertEvent(String title, String when) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showTotalEvent() {
		System.out.println("현재 진행되는 모든 이벤트 출력");
		System.out.println("1.카카오페이 결제시 할인!");
		System.out.println("2.2+1 행사");
		System.out.println("3.3만원 구매시 물티슈 증정");
		
	}

}
