import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int senha = 2022;
    System.out.println("Digite a senha:");
    int pin = sc.nextInt();

    while (pin != senha){
      System.out.println("");
      System.out.println("Senha Incorreta.");
      pin = sc.nextInt();
    }
    if (pin == senha){
      System.out.println("");
      System.out.print("Acesso Permitido.");
    }
    sc.close();
  }
}