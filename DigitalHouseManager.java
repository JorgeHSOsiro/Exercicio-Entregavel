import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private List<Professor> listaDeProfessores = new ArrayList<>();
    private List<Curso> listaDeCurso = new ArrayList<>();
    private List<Matricula> listaDeMatricula = new ArrayList<>();

    //metodos
    public void registrarCurso(String nome, Integer codigoCurso, Integer quantMaxAlunos){
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setCodigoDeCurso(codigoCurso);
        curso.setQuantMaxAlunos(quantMaxAlunos);
        listaDeCurso.add(curso);
        System.out.println("Curso " + curso.getNome() + " criado e adicionado na lista");
        System.out.println("**************************************");
    }
    public void excluirCurso(Integer codigoCurso){
        listaDeCurso.remove(codigoCurso);
        System.out.println("Curso removido");
        System.out.println("**************************************");
    }
    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessorAdjunto,Integer quantHoras){
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto();
        professorAdjunto.setNome(nome);
        professorAdjunto.setSobrenome(sobrenome);
        professorAdjunto.setCodigoDeProfessor(codigoProfessorAdjunto);
        professorAdjunto.setTempoDeCasa(quantHoras);
        listaDeProfessores.add(professorAdjunto);
        System.out.println("Professor " + professorAdjunto.getNome() + " " + professorAdjunto.getSobrenome() + " adicionado à lista");
        System.out.println("**************************************");
    }
    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessorTitular, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular();
        professorTitular.setNome(nome);
        professorTitular.setSobrenome(sobrenome);
        professorTitular.setCodigoDeProfessor(codigoProfessorTitular);
        professorTitular.setEspecialidade(especialidade);
        listaDeProfessores.add(professorTitular);
        System.out.println("Professor "+ professorTitular.getNome() + " " + professorTitular.getSobrenome() + " adicionado à lista");
        System.out.println("**************************************");
    }
    public void excluirProfessor(Integer codigoDeProfessor){
        listaDeProfessores.remove(codigoDeProfessor);
        System.out.println("Professor removido da lista");
        System.out.println("**************************************");
    }
    public void registrarAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setSobrenome(sobrenome);
        aluno.setCodigoDeAluno(codigoAluno);
        listaDeAlunos.add(aluno);
        System.out.println("Aluno "+ aluno.getNome() + " " + aluno.getSobrenome() + " registrado");
        System.out.println("**************************************");
    }
    public Aluno getAlunoPorCodigo(Integer codigoAluno){
        for (Aluno aluno : listaDeAlunos) {
            if(aluno.getCodigoDeAluno().equals(codigoAluno)){
                return aluno;
            }
        }
        return null;
    }

    public Curso getCursoPorCodigo(Integer codigoCurso){
        for (Curso curso : listaDeCurso){
            if(curso.getCodigoDeCurso().equals(codigoCurso)){
                return curso;
            }
        }
        return null;
    }

    public Professor getProfessorPorCodigo(Integer codigoProfessor) {
        for (Professor professor : listaDeProfessores){
            if (professor.getCodigoDeProfessor().equals(codigoProfessor)){
                return professor;
            }
        }
        return null;
    }
    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        Aluno aluno = getAlunoPorCodigo(codigoAluno) ;
        Curso curso = getCursoPorCodigo(codigoCurso);
        if(curso.adicionarUmAluno(aluno)){
            Matricula matricula = new Matricula();
            listaDeMatricula.add(matricula);
            System.out.println("Matricula realizada");
            System.out.println("**************************************");
        }else{
            System.out.println("Não há vagas disponiveis");
            System.out.println("**************************************");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        Curso curso = getCursoPorCodigo(codigoCurso);
        ProfessorTitular professorTitular = (ProfessorTitular) getProfessorPorCodigo(codigoProfessorTitular);
        ProfessorAdjunto professorAdjunto = (ProfessorAdjunto) getProfessorPorCodigo(codigoProfessorAdjunto);
        curso.setProfessorTitular(professorTitular);
        curso.setProfessorAdjunto(professorAdjunto);
        System.out.println("Professor " + curso.getProfessorTitular().getNome() + " " + curso.getProfessorTitular().getSobrenome() + " alocado como titular no curso " + curso.getNome());
        System.out.println("**************************************");
        System.out.println("Professor " + curso.getProfessorAdjunto().getNome() + " " + curso.getProfessorAdjunto().getSobrenome() + " alocado como adjunto no curso " + curso.getNome());
        System.out.println("**************************************");

    }

}
