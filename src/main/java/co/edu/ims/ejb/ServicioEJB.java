
package co.edu.ims.ejb;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Stateless
@Path("/pruebas")
public class ServicioEJB {
    
    
    public ServicioEJB(){}
    
    @GET
    @Produces("application/json")
    public String mostrsrMensaje(){
    return"('Mensaje': 'CODIFICADO EN JSON')";
    
    }
    
}
