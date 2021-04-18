package pepsico.servicos;

import javax.ejb.Local;

@Local
public interface RelatorioGestaoRiscoLocal {

    public int geraRelatorio(String tipo);

}
