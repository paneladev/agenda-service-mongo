package pdev.com.agenda.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pdev.com.agenda.domain.entity.Paciente;

import java.util.Optional;

@Repository
public interface PacienteRepository extends MongoRepository<Paciente, String> {

    Optional<Paciente> findByCpf(String cpf);
}