package pdev.com.agenda.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Data
@Document(collection = "usuario")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    private String id;

    @NotBlank
    private String nome;

    @NotBlank
    private String usuario;

    @NotBlank
    private String senha;
}
