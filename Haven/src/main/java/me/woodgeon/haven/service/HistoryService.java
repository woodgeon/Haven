package me.woodgeon.haven.service;

import lombok.RequiredArgsConstructor;
import me.woodgeon.haven.domain.History;
import me.woodgeon.haven.dto.AddHistoryRequest;
import me.woodgeon.haven.repository.HistoryRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HistoryService {

    private final HistoryRepository historyRepository;

    public History save(AddHistoryRequest request) {
        return historyRepository.save(request.toEntity());
    }
}
