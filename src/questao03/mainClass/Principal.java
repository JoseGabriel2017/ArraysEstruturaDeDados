package questao03.mainClass;

import java.util.Arrays;
import questao03.classesBase.Empresa;
import questao03.classesBase.Funcionario;
import questao03.classesCadastros.CadastrosDeEmpresas;
import questao03.classesCadastros.CadastrosDeFuncionarios;

public class Principal {

    public static void main(String[] args) {

        Empresa emp1 = new Empresa("16459452", "BaixeAqui", "879565951");
        Empresa emp2 = new Empresa("15459452", "BaixeAli", "879565952");
        Empresa emp3 = new Empresa("14459452", "BaixeTudo", "879565953");
        Empresa emp4 = new Empresa("13459452", "BaixeLogo", "879565954");
        Empresa emp5 = new Empresa("12459452", "BaixeSim", "879565955");

        Funcionario f = new Funcionario("115115491", "Gabriel", "1314514751", "97994565", emp1);
        Funcionario f2 = new Funcionario("1191985691", "felipe", "1359595984", "97994565", emp2);
        Funcionario f3 = new Funcionario("158456491", "pedro", "1151595847", "97994565", emp3);
        Funcionario f4 = new Funcionario("152141591", "fernando", "116235584", "97994565", emp4);
        Funcionario f5 = new Funcionario("18236491", "roger", "845158847", "97994565", emp5);

        CadastrosDeEmpresas em = new CadastrosDeEmpresas();
        CadastrosDeFuncionarios cf = new CadastrosDeFuncionarios();

        em.cadastroEmpresas(emp1);
        em.cadastroEmpresas(emp2);
        em.cadastroEmpresas(emp3);
        em.cadastroEmpresas(emp4);
        em.cadastroEmpresas(emp5);

        cf.cadastroFuncionario(f);
        cf.cadastroFuncionario(f2);
        cf.cadastroFuncionario(f3);
        cf.cadastroFuncionario(f4);
        cf.cadastroFuncionario(f5);

        System.out.println(Arrays.toString(em.listarEmpresas()));
        System.err.println(Arrays.toString(cf.listarFuncionarios()));
    }
}
