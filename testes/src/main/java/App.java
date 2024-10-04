import model.Funcionario;
import service.CalculaFeriasService;
import java.time.LocalDate;

public class App {
    public static void main(String[] args){
        CalculaFeriasService service = new CalculaFeriasService();
        Funcionario funcionario = new Funcionario();
        funcionario.setDataAdmissao(LocalDate.now());
        funcionario.setTemFeriasAtrasadas(false);
        System.out.println(service.executar(funcionario));
    }
}
