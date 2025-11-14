package mx.edu.unpa.ChatEnRed.domains;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="audit_events")

public class AuditEvent implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	//llave foranea
	@Column(name="user_id")
	private int userId;
	@Column(name="event_type")
	private String eventType;
	@Column(name="event_data")
	private String eventData;
	@Column(name="created_at")
	private LocalDateTime createdAt;
	
}
