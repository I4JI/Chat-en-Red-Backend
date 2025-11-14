package mx.edu.unpa.ChatEnRed.domains;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import mx.edu.unpa.ChatEnRed.enums.RoleStatus;

@Data
@Entity
@Table(name="conversation_Members")
public class ConversationMember implements Serializable{
	private static final long serialVersionUID =1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="conversation_id")
	private int conversationId;
	@Column(name="user_id")
	private int userId;
	@Enumerated(EnumType.STRING)
	@Column(name="role")
	private RoleStatus role = RoleStatus.MEMBER;
	@Column(name="joined_at")
	private LocalDateTime joinedAt;
	
}
