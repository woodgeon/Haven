package me.woodgeon.haven.controller;

import lombok.RequiredArgsConstructor;
import me.woodgeon.haven.domain.History;
import me.woodgeon.haven.dto.AddHistoryRequest;
import me.woodgeon.haven.service.HistoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HistoryApiController {

    private final HistoryService historyService;

    @PostMapping("/api/history")
    public ResponseEntity<History> addHistory(@RequestBody AddHistoryRequest request) {
        History savedHistory = historyService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedHistory);
    }
}
