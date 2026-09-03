package ifrn.pi.eventos.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
