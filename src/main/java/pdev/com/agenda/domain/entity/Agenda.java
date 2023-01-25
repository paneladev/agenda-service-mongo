package pdev.com.agenda.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Document(collection = "agenda")
public class Agenda {

    @Id
    private String id;
    private String descricao;
    private LocalDateTime horario;
    private LocalDateTime dataCriacao;
    private String pacienteId;
}
