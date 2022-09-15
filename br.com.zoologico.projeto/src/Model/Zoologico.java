package Model;

public class Zoologico {

    public String nome;
    Ambiente ambiente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public Zoologico(String nome, Ambiente ambiente) {
        this.nome = nome;
        this.ambiente = ambiente;
    }


    @Override
    public String toString(){
        return "Zoologico: " + this.nome +  this.ambiente;
    }

}
