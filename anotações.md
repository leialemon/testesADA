Testes de unidade: testes da menor unidade possível que uma aplicação tem (usualmente métodos).
junit : dependência maven.
Testes de unidade são métodos void. No junit 5 o teste não funciona se colocar modificador de acesso.
É bom colocar nomes grandes e bem específicos nos testes.
anotação @Test e import org.junit.jupiter.api.Test;
Teste tem as seguintes etapas:
1. Cenário
2. Execução
3. Verificação


@BeforeEach → método anotado com isso sempre vai ser executado antes da execução dos testes.