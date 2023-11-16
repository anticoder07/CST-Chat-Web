package com.CstChatWeb.CstChatWebBackend.entity.profiles;

import com.CstChatWeb.CstChatWebBackend.entity.Chat.Group;
import com.CstChatWeb.CstChatWebBackend.entity.Chat.Messenger;
import com.CstChatWeb.CstChatWebBackend.entity.token.Token;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String username;

	private String password;

	private String phoneNumber;

	private Date dateOfBirth;

	@Enumerated(EnumType.STRING)
	private Role role;

	@OneToOne(mappedBy = "user")
	private Avatar avatar;

	@OneToMany(mappedBy = "user")
	private List<Token> token;

	@OneToMany(mappedBy = "user")
	private List<Group> groups;

	@OneToMany(mappedBy = "user")
	private List<Messenger> messengers;


}