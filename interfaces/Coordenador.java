package interfaces;

public class Coordenador implements Funcionario{

    @Override
    public void calculaSalario() {
        System.out.println("salario Fixo");
    }

    @Override
    public void cumpreCargaHoraria() {
        System.out.println("carga hor�ria fixa");
    }

}
