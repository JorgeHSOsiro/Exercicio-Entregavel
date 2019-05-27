import java.util.Objects;

public class Professor {
    private String nome;
    private Integer tempoDeCasa;
    private Integer codigoDeProfessor;

    public Professor() {

    }

    public Professor(String nome, Integer tempoDeCasa, Integer codigoDeProfessor) {
        this.nome = nome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoDeProfessor = codigoDeProfessor;
    }


    //metodos
    @Override
    public boolean equals(Object objetoProfessor) {
        if (this == objetoProfessor) return true;
        if (objetoProfessor == null || getClass() != objetoProfessor.getClass()) return false;
        Professor professor = (Professor) objetoProfessor;
        return Objects.equals(nome, professor.nome) &&
                Objects.equals(tempoDeCasa, professor.tempoDeCasa) &&
                Objects.equals(codigoDeProfessor, professor.codigoDeProfessor);
    }

        //get and set

        public String getNome(){
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public Integer getTempoDeCasa () {
            return tempoDeCasa;
        }

        public void setTempoDeCasa (Integer tempoDeCasa){
            this.tempoDeCasa = tempoDeCasa;
        }

        public Integer getCodigoDeProfessor () {
            return codigoDeProfessor;
        }

        public void setCodigoDeProfessor (Integer codigoDeProfessor){
            this.codigoDeProfessor = codigoDeProfessor;
        }

}
