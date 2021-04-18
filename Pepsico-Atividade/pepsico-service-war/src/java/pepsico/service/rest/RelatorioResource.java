package pepsico.service.rest;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import pepsico.servicos.RelatorioGestaoRiscoLocal;

@Path("relatorio")
public class RelatorioResource {

    private RelatorioGestaoRiscoLocal relatorioGestaoRisco = lookupRelatorioGestaoRiscoLocal();

    @Context
    private UriInfo context;

    public RelatorioResource() {
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int getRelatorio(@QueryParam("tipo") String tipo) {
        return relatorioGestaoRisco.geraRelatorio(tipo);
    }

    private RelatorioGestaoRiscoLocal lookupRelatorioGestaoRiscoLocal() {
        try {
            javax.naming.Context c = new InitialContext();
            return (RelatorioGestaoRiscoLocal) c.lookup("java:global/pepsico-service/pepsico-service-ejb/RelatorioGestaoRisco!pepsico.servicos.RelatorioGestaoRiscoLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
