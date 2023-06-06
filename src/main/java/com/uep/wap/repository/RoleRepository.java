package com.uep.wap.repository;

import com.uep.wap.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>
{
    @Query("SELECT r FROM Role r WHERE r.role_name <> :roleName")
    List<Role> findAllByRoleNameNot(@Param("roleName") String roleName);

    @Query("SELECT r FROM Role r WHERE r.role_name = :roleName")
    Role findByRoleName(@Param("roleName") String roleName);
}
