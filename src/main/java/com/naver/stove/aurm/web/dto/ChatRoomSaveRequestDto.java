package com.naver.stove.aurm.web.dto;

import com.naver.stove.aurm.domain.chatroom.ChatRoom;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChatRoomSaveRequestDto {
    private String title;

    @Builder
    public ChatRoomSaveRequestDto(String title){
        this.title = title;
    }

    public ChatRoom toEntity(){
        return ChatRoom.builder()
                .title(title)
                .build();
    }
}
