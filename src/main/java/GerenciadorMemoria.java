import java.util.List;

public class GerenciadorMemoria {

    private Bloco inicio;
    private final int tamanhoTotal;
    private static final int TAMANHO_PADRAO = 4096;

    public GerenciadorMemoria() {
        this(TAMANHO_PADRAO);
    }

    /**
     * Cria um Gerenciador de Memória inicializando sua lista de blocos livres com um único nó
     * contendo o tamanho total da memória.
     *
     * @param tamanho o tamanho total da memória
     */
    public GerenciadorMemoria(int tamanho) {
        this.tamanhoTotal = tamanho;
        this.inicio = new Bloco(0, tamanhoTotal);
    }

    /**
     * Usado apenas para criar uma lista de teste.
     * Pode ser útil para testar as devoluções de memória.
     *
     * @param blocos
     */
    public void construir(Bloco... blocos) {
        this.inicio = blocos[0];
        Bloco ultimo = inicio;
        for (Bloco bloco : blocos) {
            ultimo.setProximo(bloco);
            ultimo = bloco;
        }
    }

    /**
     * Este método é chamado por uma aplicação para alocar n bytes de memória.
     *
     * @param tamanho o tamanho do bloco de memória a alocar
     * @return o endereço de memória onde começa o bloco alocado, ou o valor -1 caso não seja possível alocar a
     * quantidade de memória solicitada .
     */
    public int alocar(int tamanho) {
        return 0;
    }

    /**
     * Este método é chamado quando uma aplicação libera (devolve) um espaço de memória alocado anteriormente,
     *
     * @param endereco o endereço inicial de memória liberado
     * @param tamanho o tamanho do bloco devolvido
     */
    public void liberar(int endereco, int tamanho) {

    }

    private Bloco primeiraEscolha(int tamanho) {
        return null;
    }

    /**
     * Retorna uma lista com todos os blocos livres disponíveis.
     * @return um List<No> contendo todos os blocos disponíveis
     */
    public List<Bloco> getBlocosLivres() {
        return null;
    }

    /**
     * Retorna uma lista com todos os blocos, mostrando os setores disponíveis/indisponíveis da memória.
     * @return um List<No> contendo todos os blocos disponíveis/indisponíveis da memória
     */
    public List<Bloco> getTodosBlocos() {
        return null;
    }

    public void imprimir() {
        Bloco blocoAtual = inicio;
        while (blocoAtual != null) {
            System.out.print(blocoAtual + "->");
            blocoAtual = blocoAtual.getProximo();
        }
        System.out.println();
    }
}
