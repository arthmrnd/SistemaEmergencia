package br.com.letscode.dominio;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medicamento {

    private String identificador;
    private String principioAtivo;
    private String fabricante;
    private int dosagem;
    private int periodicidade;
    private LocalDateTime horarioDose;
    private Paciente paciente;


    @PostConstruct
    public void init(){
        while(LocalDateTime.now().isAfter(horarioDose)){
            this.horarioDose = horarioDose.plusHours(periodicidade);
        }
    }

}
