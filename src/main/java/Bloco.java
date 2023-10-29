public class Bloco {

    private int endereco;
    private int tamanho;
    private Bloco proximo;

    public Bloco(int endereco, int tamanho) {
        this.endereco = endereco;
        this.tamanho = tamanho;
        this.proximo = null;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Bloco getProximo() {
        return proximo;
    }

    public void setProximo(Bloco proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "[" + endereco + "|" + tamanho + "]";
    }
}
