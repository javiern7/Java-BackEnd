package pe.edu.cibertec.beans;

import org.springframework.stereotype.Controller;

@Controller
public class DocumentoTexto implements Imprimible {

    public void iniciar(){
        System.out.println("********************************************");
        System.out.println("Iniciando la construccion del bean de TEXTO");
        System.out.println("*********************************************");
    }

    public void destruir(){
        System.out.println("*********************************************");
        System.out.println("Destruyendo la instancia creada de TEXTO");
        System.out.println("*****************************************");
    }

    @Override
    public String imprimir() {
        String abc = null;
        abc.getBytes();
        return "Imprimiendo desde un archivo de texto";
    }
}
