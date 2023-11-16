package com.CstChatWeb.CstChatWebBackend.repository;

import com.CstChatWeb.CstChatWebBackend.entity.profiles.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvatarRepository extends JpaRepository<Avatar, Long> {
}
