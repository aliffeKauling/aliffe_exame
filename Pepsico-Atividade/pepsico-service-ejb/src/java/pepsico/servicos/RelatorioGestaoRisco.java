package pepsico.servicos;

import javax.ejb.Stateless;
import pepsico.iface.ContextRelatorio;
import pepsico.iface.RelatorioAcidentes;
import pepsico.iface.RelatorioPerdaContratos;
import pepsico.iface.RelatorioRoubos;

@Stateless
public class RelatorioGestaoRisco implements RelatorioGestaoRiscoLocal {

    @Override
    public int geraRelatorio(String tipo) {

        int total = 0;

        if (tipo.equals("ACIDENTES")) {
            ContextRelatorio c1 = new ContextRelatorio(new RelatorioAcidentes());
            total = c1.executaRelatorio();
        }
        if (tipo.equals("ROUBOS")) {
            ContextRelatorio c2 = new ContextRelatorio(new RelatorioRoubos());
            total = c2.executaRelatorio();
        }
        if (tipo.equals("PERDA_CONTRATOS")) {
            ContextRelatorio c3 = new ContextRelatorio(new RelatorioPerdaContratos());
            total = c3.executaRelatorio();
        }

        return total;
    }

}
