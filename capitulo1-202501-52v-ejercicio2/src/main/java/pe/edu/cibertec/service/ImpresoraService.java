package pe.edu.cibertec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.bean.Imprimible;


@Service("impresoraServiceBean")
public class ImpresoraService {

    @Autowired
    @Qualifier("documentoTexto")
    private Imprimible documento;

    public ImpresoraService() {}

    public ImpresoraService(Imprimible documento) {
        this.documento = documento;
    }

    public void imprimirDocumento(){
        System.out.println(documento.imprimir());
    }

    /*public Imprimible getDocumento(){
        return documento;
    }

    public void setDocumento(Imprimible documento){
        this.documento = documento;
    }*/
}
