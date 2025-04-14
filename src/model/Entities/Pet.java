package src.model.Entities;

import src.model.Entities.enums.Sexo;
import src.model.Entities.enums.Tipo;

public class Pet {
  protected String nome;
  protected Tipo tipo;
  protected Sexo sexo;
  protected String endereco;
  protected int idade;
  protected double peso;
  protected String raca;

  public Pet() {
    super();
  }
  public Pet(String nome, Tipo tipo, Sexo sexo, String endereco, int idade, double peso, String raca) {
    this.nome = nome;
    this.tipo = tipo;
    this.sexo = sexo;
    this.endereco = endereco;
    this.idade = idade;
    this.peso = peso;
    this.raca = raca;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  @Override
  public String toString() {
    return
        nome + " - "
        + tipo + " - "
        + sexo + " - "
        + endereco + " - "
        + idade + " ano(s) - "
        + peso + "Kg - "
        + raca;
  }
}
