import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codigoDeCurso;
    private Professor professorTitular;
    private Professor professorAdjunto;
    private Integer quantMaxAlunos;
    private List<Aluno> alunosMatriculados;


    public Curso(){

    }

    public Curso(String nome, Integer codigoDeCurso) {
        this.nome = nome;
        this.codigoDeCurso = codigoDeCurso;
    }


    //metodos
    @Override
    public boolean equals(Object objetoCurso){
        if(this==objetoCurso) return true;
        if(objetoCurso == null ||getClass() != objetoCurso.getClass())return false;
        Curso curso = (Curso) objetoCurso;
        return  Objects.equals(nome,curso.nome)&&
                Objects.equals(codigoDeCurso, curso.codigoDeCurso);
    }

    public boolean adicionarUmAluno(Aluno umAluno){
        if(alunosMatriculados.size() < quantMaxAlunos){
            alunosMatriculados.add(umAluno);
            System.out.println("O aluno foi matriculado");
            return true;
        }else{
            System.out.println("Não há vagas disponíveis");
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        alunosMatriculados.remove(umAluno);
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoDoCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDoCurso(Integer codigoDoCurso) {
        this.codigoDeCurso = codigoDoCurso;
    }

    public Professor getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public Professor getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantMaxAlunos() {
        return quantMaxAlunos;
    }

    public void setQuantMaxAlunos(Integer quantMaxAlunos) {
        this.quantMaxAlunos = quantMaxAlunos;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
