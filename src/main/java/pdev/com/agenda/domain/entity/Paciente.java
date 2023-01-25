package pdev.com.agenda.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "paciente")
public class Paciente {

    @Id
    private String id;
    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
}