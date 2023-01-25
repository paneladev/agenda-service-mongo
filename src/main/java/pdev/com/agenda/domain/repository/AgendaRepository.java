package pdev.com.agenda.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pdev.com.agenda.domain.entity.Agenda;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface AgendaRepository extends MongoRepository<Agenda, String> {

    Optional<Agenda> findByHorario(LocalDateTime horario);
}
