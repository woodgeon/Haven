package me.woodgeon.haven.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.woodgeon.haven.domain.History;

@NoArgsConstructor // 기본 생성자 추가 애너테이션
@AllArgsConstructor // 모든 필드값을 파라미터로 받는 생성자 추가
@Getter
public class AddHistoryRequest {
    private String time;
    private String status;

    public History toEntity() { // 빌더패턴을 사용하여 DTO를 Entity로 만들어주는 메소드
        return History.builder()
                .time(time)
                .status(status)
                .build();
    }
}
