package com.CstChatWeb.CstChatWebBackend.entity.Chat;

import com.CstChatWeb.CstChatWebBackend.entity.profiles.User;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String groupName;

	private Date foundedDate;

	private Long leaderId;

	@Enumerated(EnumType.STRING)
	private GroupType groupType;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	@OneToMany(mappedBy = "group")
	private List<Messenger> messengers;

	@OneToMany(mappedBy = "group")
	private List<Members> members;
}
