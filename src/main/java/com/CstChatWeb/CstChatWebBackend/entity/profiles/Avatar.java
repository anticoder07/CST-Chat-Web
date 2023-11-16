package com.CstChatWeb.CstChatWebBackend.entity.profiles;

import jakarta.persistence.*;

@Entity
public class Avatar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "userId")
	private User user;

	@Lob
	private byte[] imageData;

	private String imageName;
	private String imageType;
}
