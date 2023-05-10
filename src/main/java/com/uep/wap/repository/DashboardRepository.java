package com.uep.wap.repository;

import com.uep.wap.model.Dashboard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardRepository extends CrudRepository<Dashboard, Long> {
}
