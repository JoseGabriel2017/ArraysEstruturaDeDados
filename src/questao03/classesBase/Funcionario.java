package questao03.classesBase;

public class Funcionario {

    private String cpf;
    private String nome;
    private String rg;
    private String telefone;
    private Empresa empre;

    public Funcionario(String cpf, String nome, String rg, String telefone, Empresa empre) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
        this.empre = empre;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Empresa getEmpre() {
        return empre;
    }
    public void setEmpre(Empresa empre) {
        this.empre = empre;
    }

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", nome=" + nome + ", rg=" + rg + ", telefone=" + telefone + ", empre=" + empre + "]";
    }

    
}
