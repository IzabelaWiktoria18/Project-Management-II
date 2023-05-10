package com.uep.wap.repository;

import com.uep.wap.model.Calendar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends CrudRepository<Calendar, Long> {
}
