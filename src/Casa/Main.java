package Casa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogador> participantes = new ArrayList<>();

        participantes.add(new Jogador("Alane Dias"));
        participantes.add(new Jogador("Beatriz Reis"));
        participantes.add(new Jogador("Davi Brito"));
        participantes.add(new Jogador("Deniziane Ferreira"));
        participantes.add(new Jogador("Fernanda Bande"));
        participantes.add(new Jogador("Giovanna Lima"));
        participantes.add(new Jogador("Giovanna Pitel"));
        participantes.add(new Jogador("Isabelle Nogueira"));
        participantes.add(new Jogador("Juninho"));
        participantes.add(new Jogador("Leidy Elin"));
        participantes.add(new Jogador("Lucas Henrique"));
        participantes.add(new Jogador("Lucas Luigi"));
        participantes.add(new Jogador("Lucas Pizane"));
        participantes.add(new Jogador("Marcus Vinicius"));
        participantes.add(new Jogador("Matteus Amaral"));
        participantes.add(new Jogador("Maycon Cosmer"));
        participantes.add(new Jogador("MC Bin Laden"));
        participantes.add(new Jogador("Michel Nogueira"));
        participantes.add(new Jogador("Nizam"));
        participantes.add(new Jogador("Raquele Cardozo"));
        participantes.add(new Jogador("Rodriguinho"));
        participantes.add(new Jogador("Thalyta Alves"));
        participantes.add(new Jogador("Vanessa Lopes"));
        participantes.add(new Jogador("Vinicius Rodrigues"));
        participantes.add(new Jogador("Wanessa Camargo"));
        participantes.add(new Jogador("Yasmin Brunet"));

        listarParticipantes(participantes);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Em quem você vota para sair da casa?");
            String voto = scanner.nextLine();
            if (voto.equalsIgnoreCase("sair")) {
                break;
            }
            boolean encontrado = false;
            for (Jogador jogador : participantes) {
                if (jogador.getNome().equalsIgnoreCase(voto)) {
                    jogador.incrementaUmVoto();
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Participante não encontrado. Tente novamente.");
            }
        }

        Jogador maisVotado = null;
        for (Jogador jogador : participantes) {
            if (maisVotado == null || jogador.getVotos() > maisVotado.getVotos()) {
                maisVotado = jogador;
            }
        }

        if (maisVotado != null) {
            System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu vou conseguir te eliminar com alegria. Com " + maisVotado.getVotos() + " votos, é você quem sai " + maisVotado.getNome() + ".");
        }
    }

    public static void listarParticipantes(ArrayList<Jogador> participantes) {
        System.out.println("Lista de Participantes:");
        for (Jogador jogador : participantes) {
            System.out.println(jogador.getNome());
        }
    }
}