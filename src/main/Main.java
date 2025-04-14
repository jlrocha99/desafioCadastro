package src.main;

import src.Application.Menu;
import src.model.Entities.Cadastro;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    Menu menu = new Menu();
    ArrayList<Integer> opcoes = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    int escolha = 0;

    System.out.println();
    System.out.println("Escolha uma das opcoes abaixo: ");

    try {
      do {
        menu.mostrarMenuPrincipal();
        System.out.print("Opcao: ");
        escolha = input.nextInt();
        System.out.println();
      }
      while (!opcoes.contains(escolha));

    } catch (InputMismatchException ie) {
      System.out.println("Digite apenas numeros entre 1 e 6");

    }

    switch (escolha) {
      //Cadastro
      case 1:
        Cadastro cadastro = new Cadastro();
        //opcoes de cadastro
        cadastro.menuCadastro();

        //cadastro de pets
        cadastro.cadastroPets();
        break;

      //Aletrar os dados do pet cadastrado
      case 2:
        System.out.println("entrou 2");
        //chamar classe Alterar
        break;
      case 3:
        System.out.println("entrou 3");
        //chamar classe Deletar
        break;
      case 4:
        System.out.println("entrou 4");
        //Chamar classe listar todos os pets
        break;
      case 5:
        System.out.println("entrou 5");
        //Listar pets por critério
        break;
      case 6:
        System.out.println("Saiu");
        break;
    }

  }
}