package mx.edu.unpa.ChatEnRed.services;

import java.util.Optional;

import mx.edu.unpa.ChatEnRed.domains.AuditEvent;


public interface AuditEventService {
	public Iterable<AuditEvent> findAll();
	//public Page<Teacher> findAll(Pageable pageable);
	public Optional<AuditEvent> findById(int id);
	public AuditEvent save(AuditEvent calificacion);
	public void deleteById(int id);
}
