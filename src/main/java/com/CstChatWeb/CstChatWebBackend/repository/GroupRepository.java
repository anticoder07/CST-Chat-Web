package com.CstChatWeb.CstChatWebBackend.repository;

import com.CstChatWeb.CstChatWebBackend.entity.Chat.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}
