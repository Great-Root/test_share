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
		// TODO Auto-generated method stub
		
	}

}
