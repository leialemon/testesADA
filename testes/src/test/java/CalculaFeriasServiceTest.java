import model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.CalculaFeriasService;

import java.time.LocalDate;

class CalculaFeriasServiceTest {

    Funcionario funcionario;
    CalculaFeriasService service;

    @BeforeEach
    public void setup(){
        funcionario = new Funcionario();
        service = new CalculaFeriasService();
    }

    @Test
    void deveConseguirTirarFeriasDadoQueEntrouUmAnoAtras() {
        //CENÁRIO
        funcionario.setTemFeriasAtrasadas(false);
        funcionario.setDataAdmissao(LocalDate.of(2023, 10,4));

        //EXECUÇÃO
        boolean isHabilitadoParaTirarFerias = service.executar(funcionario);

        //VERIFICAÇÃO
        Assertions.assertTrue(isHabilitadoParaTirarFerias);
    }

    @Test
    void naoDeveConseguirTirarFeriasDadoQueEntrouHoje(){
        funcionario.setDataAdmissao(LocalDate.now());
        funcionario.setTemFeriasAtrasadas(false);

        boolean isHabilitadoParaTirarFerias = service.executar(funcionario);

        Assertions.assertFalse(isHabilitadoParaTirarFerias);
    }

    @Test
    void deveConseguirTirarFeriasDadoQueTemFeriasAtrasadas(){
        funcionario.setTemFeriasAtrasadas(true);

        boolean isHabilitadoParaTirarFerias = service.executar(funcionario);

        Assertions.assertTrue(isHabilitadoParaTirarFerias);
    }
}