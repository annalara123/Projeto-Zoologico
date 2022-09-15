package Model;

public class Animal {
    String habitat;
    String nome;
    String especie;
    String genero;



    int idade;
    String statusDeSaude;


    public Animal(String habitat, String nome, String especie, String genero, int idade, String statusDeSaude) {
        this.habitat = habitat;
        this.nome = nome;
        this.especie = especie;
        this.genero = genero;
        this.idade = idade;
        this.statusDeSaude = statusDeSaude;
    }

    public String getHabitat() {return habitat;}

    public void setHabitat(String habitat) {this.habitat = habitat;}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getStatusDeSaude() {
        return statusDeSaude;
    }

    public void setStatusDeSaude(String statusDeSaude) {this.statusDeSaude = statusDeSaude;}

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
