package service;

import model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import repository.FuncionarioRepository;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CreateFuncionarioServiceTest {

    @Test
    void deveSalvarFuncionario() {
        //CENÁRIO
        FuncionarioRepository funcionarioRepositoryMock = Mockito.mock(FuncionarioRepository.class);
        CreateFuncionarioService createFuncionarioService = Mockito.mock(CreateFuncionarioService.class);
        Funcionario funcionarioTeste = new Funcionario();
        funcionarioTeste.setNome("Rodrigo");
        funcionarioTeste.setDataAdmissao(LocalDate.now());
        funcionarioTeste.setTemFeriasAtrasadas(false);


        //EXECUÇÃO
        Funcionario retorno = createFuncionarioService.salvar(funcionarioTeste);

        //VERIFICAÇÃO
        Assertions.assertNotNull(retorno);
        Assertions.assertEquals("Rodrigo",retorno.getNome());
        Assertions.assertEquals(LocalDate.now(), retorno.getDataAdmissao());
        //Perguntar como fazer o assertion de LocalDateTime.
        //Perguntar sobre implementação de inline mocking
        Assertions.assertFalse(retorno.isTemFeriasAtrasadas());
    }
}