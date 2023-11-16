package com.CstChatWeb.CstChatWebBackend.entity.community;

import com.CstChatWeb.CstChatWebBackend.entity.profiles.User;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Friend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date sendDate;

	private Long userIdReceive;

	private Boolean friendType;
	// yes is agree
	// no is disagreed

	@ManyToOne
	@JoinColumn(name = "userIdSend")
	private User user;
}
