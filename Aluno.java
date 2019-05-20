import java.util.Objects;

public class Aluno {
    private String nome;
    private String sobrenome;
    private Integer codigoDeAluno;

    public Aluno(){

    }

    public Aluno(String nome, String sobrenome, Integer codigoDeAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoDeAluno = codigoDeAluno;
    }

    //metodos
    @Override
    public boolean equals(Object objetoAluno){
        if(this == objetoAluno) return true;
        if(objetoAluno==null ||getClass() != objetoAluno.getClass())return false;
        Aluno aluno = (Aluno) objetoAluno;
        return  Objects.equals(nome,aluno.nome)&&
                Objects.equals(sobrenome, aluno.sobrenome) &&
                Objects.equals(codigoDeAluno, aluno.codigoDeAluno);
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoDeAluno() {
        return codigoDeAluno;
    }

    public void setCodigoDeAluno(Integer codigoDeAluno) {
        this.codigoDeAluno = codigoDeAluno;
    }
}
