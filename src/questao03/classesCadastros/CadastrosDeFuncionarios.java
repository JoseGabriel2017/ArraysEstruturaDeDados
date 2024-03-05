package questao03.classesCadastros;

import questao03.classesBase.Funcionario;

public class CadastrosDeFuncionarios {

    Funcionario[] fn = new Funcionario[5];
    int contador = 0;

    public void cadastroFuncionario(Funcionario fun) {
        fn[contador] = fun;
        contador++;
    }

    public Funcionario[] listarFuncionarios() {
        return fn;
        System.out.println("\n");
    }
}
