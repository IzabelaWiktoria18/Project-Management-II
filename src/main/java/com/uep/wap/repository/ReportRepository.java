package com.uep.wap.repository;

import com.uep.wap.model.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends CrudRepository<Report, Long> {
}
