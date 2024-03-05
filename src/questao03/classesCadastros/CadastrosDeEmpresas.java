package questao03.classesCadastros;

import questao03.classesBase.Empresa;

public class CadastrosDeEmpresas {

    Empresa[] emp = new Empresa[5];
    int contador = 0;

    public void cadastroEmpresas(Empresa empre) {

        if (contador < emp.length) {
            emp[contador] = empre;
            contador++;
        } else {
            System.out.println("Não existe espaço mais nesse vetor! ");
        }
    }

    public Empresa[] listarEmpresas() {
        return emp;
    }
}
