public class ProfessorTitular extends Professor {
    private String especialidade;

    @Override
    public String toString() {
        return "ProfessorTitular{" +
                "especialidade='" + especialidade + '\'' +
                '}';
    }

    //get and set
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

