package pepsico.iface;

/**
 *
 * @author
 */
public class RelatorioAcidentes implements StrategyRelatorio {

    //Aqui retornamos valores estaticos, mas essa informação poderia vim de um banco de dados
    @Override
    public int quantidade() {
        return 5;
    }

}
