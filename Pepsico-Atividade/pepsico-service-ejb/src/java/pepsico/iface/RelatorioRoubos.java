package pepsico.iface;

public class RelatorioRoubos implements StrategyRelatorio {

    //Aqui retornamos valores estaticos, mas essa informa��o poderia vim de um banco de dados
    @Override
    public int quantidade() {
        return 20;
    }

}
