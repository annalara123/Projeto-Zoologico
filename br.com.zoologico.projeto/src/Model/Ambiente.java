package Model;

public class Ambiente {

    /*String nome;
    String tipo;
    String tamanho;
    int quantidadeDeAnimais;*/
    public String nomeAmbiente;

    public String getNomeAmbiente() {
        return nomeAmbiente;
    }

    public Ambiente(String nomeAmbiente) {
        this.nomeAmbiente = nomeAmbiente;
    }

    public void setNome(String nomeAmbiente) {
        this.nomeAmbiente = nomeAmbiente;
    }

    Animal[] listaAnimais;

    public Ambiente(int capacidade){
        listaAnimais = new Animal[capacidade];
    }

    public void getlistaAnimais() {
        for (Animal listaAnimais : this.listaAnimais) {
            System.out.println(listaAnimais);
        }
    }

    public void setListaAnimais(int posicao,String nomeAmbiente,Animal animal) {

        this.nomeAmbiente = nomeAmbiente;
        this.listaAnimais[posicao] = animal;
    }


    /*public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidadeDeAnimais() {
        return quantidadeDeAnimais;
    }

    public void setQuantidadeDeAnimais(int quantidadeDeAnimais) {
        this.quantidadeDeAnimais = quantidadeDeAnimais;
    }

    public Ambiente(String nome, String tipo, String tamanho, int quantidadeDeAnimais) {
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidadeDeAnimais = quantidadeDeAnimais;
    }*/
    @Override
    public String toString(){
        /*"Nome: "+ this.getNomeAmbiente() +"Animal: "+ this.getlistaAnimais();*/
        this.getlistaAnimais();
        return "";
        /*return "{Nome: "+ this.nome +"\nTipo: " + this.tipo + "\nTamanho: " + this.tamanho + "\nQuantidade de animais: " + this.quantidadeDeAnimais +"}"*/
    }


}
