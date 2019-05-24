public class ProfessorAdjunto extends Professor {
    private Integer quantidadeHoras;
    //metodos
    @Override
    public String toString() {
        return "ProfessorAdjunto{" +
                "quantidadeHoras=" + quantidadeHoras +
                '}';
    }
    //get and set
    public Integer getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Integer quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }


}
