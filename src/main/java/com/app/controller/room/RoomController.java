package com.app.controller.room;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.dto.room.Room;
import com.app.service.room.RoomService;


@Controller
public class RoomController {
	
	@Autowired	// 의존성 주입(Dependancy Injection)
	RoomService roomService;
	
	//접속했을때 보유한 모든 호실 정보 보여주는 페이지
	@GetMapping("/rooms")  
	public String rooms(Model model) {
		
		Room r = new Room(); // 롬북에서 getter,setter메소드 인식못함 => 이클립스에 롬복 설치
		
		r.setBuildingNumber("101");
		r.setFloor(3);
		
		//호실 정보! 준비
		List<Room> roomList = roomService.findRoomList();
		
		//화면에 전달
		model.addAttribute("roomList", roomList);
		
		//화면 연결
		return "room/rooms";
	}
	
}
