package pdev.com.agenda.api.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgendaResponse {

    private String id;
    private String descricao;
    private LocalDateTime horario;
    private PacienteResponse paciente;

}
