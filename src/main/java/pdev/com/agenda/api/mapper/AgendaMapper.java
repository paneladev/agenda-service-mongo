package pdev.com.agenda.api.mapper;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pdev.com.agenda.api.request.AgendaRequest;
import pdev.com.agenda.api.response.AgendaResponse;
import pdev.com.agenda.api.response.PacienteResponse;
import pdev.com.agenda.domain.entity.Agenda;
import pdev.com.agenda.domain.entity.Paciente;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AgendaMapper {

    private final ModelMapper mapper;

    public Agenda toAgenda(AgendaRequest request) {
        return mapper.map(request, Agenda.class);
    }

    public AgendaResponse toAgendaResponse(Agenda agenda, Paciente paciente) {
        return AgendaResponse.builder()
                .id(agenda.getId())
                .descricao(agenda.getDescricao())
                .horario(agenda.getHorario())
                .paciente(PacienteResponse.builder()
                        .id(paciente.getId())
                        .nome(paciente.getNome())
                        .sobrenome(paciente.getSobrenome())
                        .email(paciente.getEmail())
                        .cpf(paciente.getCpf())
                        .build())
                .build();
    }

    public AgendaResponse toAgendaResponse(Agenda agenda) {
        return mapper.map(agenda, AgendaResponse.class);
    }

    public List<AgendaResponse> toAgendaResponseList(List<Agenda> agendas) {
        return agendas.stream()
                .map(this::toAgendaResponse)
                .collect(Collectors.toList());
    }
}
