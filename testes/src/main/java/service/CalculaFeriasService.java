package service;

import model.Funcionario;
import java.time.LocalDate;

public class CalculaFeriasService {

    public boolean executar(Funcionario funcionario){
        LocalDate admissao = funcionario.getDataAdmissao();
        LocalDate atual = LocalDate.now();
        return funcionario.isTemFeriasAtrasadas() || admissao.plusYears(1).isEqual(atual);
    }
}
