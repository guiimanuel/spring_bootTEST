package br.ifpe.jaboatao.model;

public class Aluno extends Usuario{
    private String matricula;
    private String tipoSanguineo;
    private Escola escolaOrigem;

    public Aluno(){
        super("","",0,"","","");
    }

    public Aluno(String nome, String cpf, int idade, String email_pessoal, String email_institucional, String senha, String matricula){
        super(nome,cpf,idade,email_pessoal,email_institucional,senha);
        this.matricula = matricula;
    }


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipoSanguineo() {
        return this.tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Escola getEscolaOrigem() {
        return this.escolaOrigem;
    }

    public void setEscolaOrigem(Escola escolaOrigem) {
        this.escolaOrigem = escolaOrigem;
    }

}
