package com.uep.wap.repository;

import com.uep.wap.model.AppProjectManagementII;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppProjectManagementIIRepository extends CrudRepository<AppProjectManagementII, Long> {
}
