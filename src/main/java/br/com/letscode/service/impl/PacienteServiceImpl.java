package br.com.letscode.service.impl;

import br.com.letscode.dao.EmergenciaDao;
import br.com.letscode.dominio.Medicamento;
import br.com.letscode.service.PacienteService;
import jakarta.inject.Inject;

import java.io.IOException;
import java.util.List;

public class PacienteServiceImpl implements PacienteService {

    @Inject
    private EmergenciaDao emergenciaDao;

    @Override
    public List<Medicamento> consultaPaciente(String cpf) throws IOException {
        return emergenciaDao.findByCpf(cpf);
    }

}