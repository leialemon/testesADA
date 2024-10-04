package service;

import model.Funcionario;
import org.springframework.stereotype.Service;
import repository.FuncionarioRepository;

@Service
public class CreateFuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public CreateFuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    public Funcionario salvar(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }
}
