import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaDeAlunos;
    private List<Professor> listaDeProfessores;
    private List<Curso> listaDeCurso;
    private List<Matricula> listaDeMatricula;

    //metodos
    public void registrarCurso(String nome, Integer codigoCurso, Integer quantMaxAlunos){
        Curso curso = new Curso();
        listaDeCurso.add(curso);
        System.out.println("Curso criado e adicioando na lista");
    }
    public void excluirCurso(Integer codigoCurso){
        listaDeCurso.remove(codigoCurso);
        System.out.println("Curso removido");
    }
    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor,Integer quantHoras){
        Professor professorAdjunto = new ProfessorAdjunto();
        listaDeProfessores.add(professorAdjunto);
        System.out.println("Professor adicionado à lista");
    }
    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        Professor professorTitular = new ProfessorTitular();
        listaDeProfessores.add(professorTitular);
        System.out.println("Professor adicionado à lista");
    }
    public void excluirProfessor(Integer codigoProfessor){
        listaDeProfessores.remove(codigoProfessor);
        System.out.println("Professor removido da lista");
    }
    public void registrarAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno aluno = new Aluno();
        listaDeAlunos.add(aluno);
        System.out.println("Aluno registrado");

    }
    public  Aluno getAlunoPorCodigo(Integer codigoAluno){
        for (Aluno aluno : listaDeAlunos) {
            if(aluno.getCodigoDeAluno() == codigoAluno){
                return aluno;
            }
        }
        return null;
    }

    public Curso getCursoPorCodigo(Integer codigoCurso){
        for (Curso curso : listaDeCurso){
            if(curso.getCodigoDoCurso() == codigoCurso){
                return curso;
            }
        }
        return null;
    }
    public Professor getProfessorPorCodigo(Integer codigoProfessor) {
        for (Professor professor : listaDeProfessores){
            if (professor.getCodigoProfessor() == codigoProfessor){
                return professor;
            }
        }
        return null;
    }
    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        Aluno aluno = getAlunoPorCodigo(codigoAluno) ;
        Curso curso = getCursoPorCodigo(codigoCurso);
        if(curso.adicionarUmAluno(aluno) == true){
            Matricula matricula = new Matricula();
            listaDeMatricula.add(matricula);
            System.out.println("Matricula realizada");
        }else{
            System.out.println("Não há vagas disponiveis");
        }
    }

    public void alocarProfesores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        Curso curso = getCursoPorCodigo();
        Professor professorTitular = getProfessorPorCodigo();
        Professor professorAdjunto = getProfessorPorCodigo();
        System.out.println("Curso: " + curso +"\n" + "Professor Titular: " + professorTitular + "\n" + "Professor Adjunto: " + professorAdjunto);
    }
}
