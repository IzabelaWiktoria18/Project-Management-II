package com.uep.wap.repository;

import com.uep.wap.model.KanbanBoard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KanbanBoardRepository extends CrudRepository<KanbanBoard, Long> {
}
