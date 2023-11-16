package com.CstChatWeb.CstChatWebBackend.repository;

import com.CstChatWeb.CstChatWebBackend.entity.Chat.Messenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Messenger, Long> {
}
