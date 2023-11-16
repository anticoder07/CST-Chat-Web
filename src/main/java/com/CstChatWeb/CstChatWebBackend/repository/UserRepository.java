package com.CstChatWeb.CstChatWebBackend.repository;

import com.CstChatWeb.CstChatWebBackend.entity.profiles.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
