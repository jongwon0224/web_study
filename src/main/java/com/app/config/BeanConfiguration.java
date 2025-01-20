package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.dao.room.RoomDAO;
import com.app.dao.room.impl.RoomDAOImpl;
import com.app.service.room.RoomService;
import com.app.service.room.impl.RoomServiceImpl;

@Configuration 
public class BeanConfiguration {
	
	/* 
	 * 설정과 관련된 파일은 config폴더에
	 * servlet-context에 아래 코드 추가
	 * <context:component-scan base-package="com.app.config"></context:component-scan> 
	 * */
	
	/* 아래 Bean주석 코드는 해석하면 아래와 같음.
	 * RoomDAO roomDAO = new RoomDAOImpl();
	 * */
	
	@Bean
	public RoomDAO roomDAO() {
		return new RoomDAOImpl();
	}
	
	//RoomDAO 매개변수필수 => Bean사용하면 자동으로 맵핑이됨
	@Bean
	public RoomService roomService(RoomDAO roomDAO) {
		//1번 방법 => roomDAO객체를 setter활용해서 넘기기
//		RoomServiceImpl roomService = new RoomServiceImpl();
//		roomService.setRoomDAO(roomDAO);
//		
//		return new RoomServiceImpl();
		
		// 2번 방법 => RoomDAO객체를 매개변수로 넘기기
//		return new RoomServiceImpl(roomDAO);
		
		return null;
	}
}
