package com.CstChatWeb.CstChatWebBackend.repository;

import com.CstChatWeb.CstChatWebBackend.entity.community.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {
}
