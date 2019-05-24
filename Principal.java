import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        DigitalHouseManager manager = new DigitalHouseManager();
        manager.registrarProfessorTitular("Paulo", "Viegas", 1235, "Full Stack");
        manager.registrarProfessorAdjunto("Larissa", "Oliveira", 2346, 48 );
        manager.registrarCurso("Full Stack", 20002, 2);
        manager.alocarProfessores(20002, 1235, 2346);
        manager.registrarAluno("Jorge", "Osiro", 370965);
        manager.registrarAluno("Alexandre","Ottoni",370456);
        manager.registrarAluno("Davi", "Moreira",123345);
        manager.registrarAluno("Lais", "Mizuno", 987654);

        manager.matricularAluno(370965, 20002);
        manager.matricularAluno(370456, 20002);
        manager.matricularAluno(123345,20002);


        manager.registrarProfessorTitular("Fabio", "Tadashi", 1234, "Android");
        manager.registrarProfessorAdjunto("Guilherme", "Sartori", 2345, 72);
        manager.registrarCurso("Android", 20001, 3);
        manager.alocarProfessores(20001, 1234, 2345);
        manager.registrarAluno("Camila", "Piragibe", 370789);
        manager.registrarAluno("Carol", "Castro", 370824);

        manager.matricularAluno(370789, 20001);
        manager.matricularAluno(370824, 20001);



    }
}
