import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date dataMatricula = new Date();

    public Matricula(){

    }

    public Matricula(Aluno aluno, Curso curso, Date dataMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }

    //get and set

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
