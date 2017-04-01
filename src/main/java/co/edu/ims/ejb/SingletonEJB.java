
package co.edu.ims.ejb;

import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Singleton
@Path("/singleton")
public class SingletonEJB {
    
    int numeroLlamada = 1;
    
    @GET
    @Produces("application/json")
    public String mostrsrMensaje(){
        
    numeroLlamada ++;
    return"('Llamada': '"+numeroLlamada+"')";
    
}
}