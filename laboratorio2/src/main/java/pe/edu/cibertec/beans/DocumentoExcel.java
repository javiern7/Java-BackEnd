package pe.edu.cibertec.beans;

public class DocumentoExcel implements Imprimible {

    public void iniciar(){
        System.out.println("********************************************");
        System.out.println("Iniciando la construccion del bean DocumentoExcel");
        System.out.println("*********************************************");
    }

    public void destruir(){
        System.out.println("*********************************************");
        System.out.println("Destruyendo la instancia creada DocumentoExcel");
        System.out.println("*****************************************");
    }

    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo Excel";
    }
}
