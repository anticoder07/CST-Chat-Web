package com.CstChatWeb.CstChatWebBackend.entity.token;

import com.CstChatWeb.CstChatWebBackend.entity.profiles.User;
import jakarta.persistence.*;

@Entity
public class Token {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String token;

	@Enumerated(EnumType.STRING)
	private RoleType roleType = RoleType.BEARER;

	private boolean revoked;

	private boolean expired;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userID")
	private User user;
}
