package pdev.com.agenda.api.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacienteResponse {

    private String id;
    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
}
