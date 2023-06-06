package com.uep.wap.repository;

import com.uep.wap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
    List<User> findByLogin(String login);

    List<User> findByEmail(String email);
}
