package com.CstChatWeb.CstChatWebBackend.entity.Chat;

import com.CstChatWeb.CstChatWebBackend.entity.profiles.User;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Messenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String messenger;

	private Date sendDate;

	@Enumerated(EnumType.STRING)
	private MessengerType messageType;

	@ManyToOne
	@JoinColumn(name = "groupId")
	private Group group;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

}
