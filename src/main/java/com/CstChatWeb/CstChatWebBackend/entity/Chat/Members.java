package com.CstChatWeb.CstChatWebBackend.entity.Chat;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Members {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long userId;
	private Date joinDate;

	@ManyToOne
	@JoinColumn(name = "groupId")
	private Group group;
}
