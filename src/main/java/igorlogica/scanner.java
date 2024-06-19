package igorlogica;

public class scanner {
    public static void main (String[] args){


        //instancia objeto da classe
        //System in - lê aa informações do teclado
        //Scanner - Objeto da classe Scanner
        java.util.Scanner objetoNome = new java.util.Scanner(System.in);

        System.out.println("digite seu nome: ");

        //ler oque o usuario digitar e armazenar na variavel nome
        String nome = objetoNome.nextLine();
        //------------------------------------------

        System.out.println("digite sua idade: ");
        //ler oque o usuario digitar e armazenar na variavel nome
        int idade = objetoNome.nextInt();

        System.out.println("nome digitado: " + nome );
        System.out.println("idade digitada: " + idade );
        System.out.println(nome + " tem " + idade + " anos" );
        /*










         */
    }
}
