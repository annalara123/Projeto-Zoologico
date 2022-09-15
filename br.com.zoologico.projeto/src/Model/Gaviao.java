package Model;

public class Gaviao extends Animal {

    public Boolean colocouOvos;
    public String qualidadeDasPenas;


    public Gaviao(String habitat, String nome, String especie, String genero, int idade, String statusDeSaude, Boolean colocouOvos, String qualidadeDasPenas) {
        super(habitat, nome, especie, genero, idade, statusDeSaude);
        this.colocouOvos = colocouOvos;
        this.qualidadeDasPenas = qualidadeDasPenas;
    }


    public Boolean getColocouOvos() {
        return colocouOvos;
    }

    public void setColocouOvos(Boolean colocouOvos) {
        this.colocouOvos = colocouOvos;
    }

    public String getQualidadeDasPenas() {
        return qualidadeDasPenas;
    }

    public void setQualidadeDasPenas(String qualidadeDasPenas) {
        this.qualidadeDasPenas = qualidadeDasPenas;
    }

    @Override
    public String getHabitat() {return habitat;}

    @Override
    public void setHabitat(String habitat) {this.habitat = habitat;}
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEspecie() {
        return super.getEspecie();
    }

    @Override
    public void setEspecie(String especie) {
        super.setEspecie(especie);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public String getStatusDeSaude() {
        return super.getStatusDeSaude();
    }

    @Override
    public void setStatusDeSaude(String statusDeSaude) {
        super.setStatusDeSaude(statusDeSaude);
    }


    @Override
    public String toString(){
        return "{Habitat: " + this.habitat + "\nNome: "+ this.nome + " ,Especie: "+  this.especie + " ,Genero: "+ this.genero+ " ,Idade: " + this.idade + " ,Status de Saude: "+
                this.statusDeSaude + " ,Colocou ovos: " + this.colocouOvos + " ,Qualidade das penas: " + this.qualidadeDasPenas+"}";
    }
}
