package com.app.service.room;

import java.util.List;

import com.app.dto.room.Room;

public interface RoomService {
	List<Room> findRoomList();
	
	int saveRoom(Room room);
	
	Room findRoomByRoomId(int room);
	
	int removeRoom(int roomId);
}
