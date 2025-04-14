package src.model.Entities;

import src.model.Entities.enums.Sexo;
import src.model.Entities.enums.Tipo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Cadastro extends Pet {
  Scanner input = new Scanner(System.in);
  ArrayList<Pet> listaPets = new ArrayList<>();


  public void menuCadastro() {
    String path = "c:\\Projetos_Java\\desafioCadastro\\formulario.txt";
    //Bloco para leitura da opcao 'Cadastrar Pet'
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();

      //Enquanto houver conteúdo, leia!
      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
    //Metodo que cadastra pets em um lista
    public void cadastroPets() {

      System.out.println();
      System.out.print("1- ");
      nome = input.nextLine();
      System.out.print("2- ");
      tipo = Tipo.valueOf(input.nextLine());
      System.out.print("3- ");
      sexo = Sexo.valueOf(input.nextLine());
      System.out.print("4- ");
      endereco = input.nextLine();
      System.out.print("5- ");
      idade = input.nextInt();
      System.out.print("6- ");
      peso = input.nextDouble();
      //Consumir buffer
      input.nextLine();
      System.out.print("7- ");
      raca = input.nextLine();

      Pet pet = new Pet(nome, tipo, sexo, endereco, idade, peso, raca);
      listaPets.add(pet);

      for (Pet pets: listaPets ) {
        System.out.println(pets);
      }
    }


}




