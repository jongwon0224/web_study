package com.app.service.room.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.room.RoomDAO;
import com.app.dto.room.Room;
import com.app.service.room.RoomService;

import lombok.Data;

@Data


@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	RoomDAO roomDAO;
	
	// configuration 연습
//	public RoomServiceImpl() {
//		
//	}
//	
//	public RoomServiceImpl(RoomDAO roomDAO) {
//		this.roomDAO = roomDAO;
//	}
	
	@Override
	public List<Room> findRoomList() {
		
		List<Room> roomList = roomDAO.findRoomList();
		
		return roomList;
	}

}
