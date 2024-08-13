package me.woodgeon.haven.repository;

import me.woodgeon.haven.domain.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {

}
