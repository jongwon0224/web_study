package com.app.dto.room;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor // 빈 생성자
@AllArgsConstructor // 전체 생성자

@Data // @Getter, @Setter, @ToString 포함 
public class Room {

	// getter,setter,toString,생성자 코드 생성안하고 lombok통해서 주석처리로 가능
	
	int roomId; // Primary Key 기본키 식별자
	String buildingNumber; //동 이름
	int roomNumber; //호실번호
	int floor; //층
	int maxGuestCount; //최대 숙박인원
	String viewType; //OCN / CTY/ MOT 오션뷰, 시티뷰, 마운틴뷰
	
	int accomodationId;
	
}
