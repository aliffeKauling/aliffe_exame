package pepsico.iface;

public class RelatorioPerdaContratos implements StrategyRelatorio {

    //Aqui retornamos valores estaticos, mas essa informa��o poderia vim de um banco de dados
    @Override
    public int quantidade() {
        return 10;
    }

}
