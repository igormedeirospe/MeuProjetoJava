package igorlogica;

public class mediaEscolarCompleta {
    public static void main(String[] args) {

        java.util.Scanner objetoNota = new java.util.Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.println("digite sua nota1");
        nota1 = objetoNota.nextDouble();

        System.out.println("digite sua nota2");
        nota2 = objetoNota.nextDouble();

        System.out.println("digite sua nota3");
        nota3 = objetoNota.nextDouble();

        System.out.println("digite sua nota4");
        nota4 = objetoNota.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) /4;

        if(media >=7){
            System.out.println("parabens voce atingiu nota suficiente de media " + media);
        }else if(media >=4){
            System.out.println("voce esta em recuperacao pois atingiu media " + media);
        }else{
            System.out.println("reprovado");
        }

    }
}
