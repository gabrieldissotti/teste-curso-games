package teste_curso_games;

import java.util.ArrayList;

public class Game {
	public static void main(String[] args) {

		Player player = new Player();
		ArrayList<Inimigo> inimigos = new ArrayList<Inimigo>();
		inimigos.add(new ElfInimigo(100));
		inimigos.add(new ElfInimigo(100));
		inimigos.add(new ElfInimigo(100));
		inimigos.add(new ElfInimigo(100));
		inimigos.add(new ElfInimigo(100));
		
		// inimigos.get(0).tomarDano();
		
		// System.out.println(inimigos.get(0).vida);
		
		for(int i = 0; i < inimigos.size(); i++) {
			Inimigo inimigoLocal = inimigos.get(i);
			if(i == 1) {
				inimigoLocal.tomarDano();
				System.out.println(inimigoLocal.vida);
			} else {
				System.out.println(inimigoLocal.vida);
			}
		}
		
		
		
/*
		 String nome = "Gabriel";
		int idade = 28;
		double peso = 80.3;
		boolean tipo = true;
				
		System.out.println("Hello World! " + nome);
		System.out.println("A idade é: " + idade);
		System.out.println("O peso é: " + peso);
		
		if(idade == 28) {
			System.out.println("A idade é 28");
		} else {
			System.out.println("A idade correta é " + idade);
		}
		
		if(nome.equals("Gabriel")) {
			System.out.println("Verdade");
		}
		
		System.out.println("tipo: " + tipo);
		
		
		int contador = 1;
		
		while (contador <= 10) {
			System.out.println("O número atual é " + contador);
			
			contador++;
		}
		
		for(int i = 2; i <= 10; i += 2) {
			System.out.println("O número atual é " + i);
		}
		
		
		////
		
		Player player = new Player();
		
		System.out.println(player.vida);
		
		player.perderVida();
		player.perderVida();
		player.ganharVida();
		

		System.out.println(player.vida);
		

		ElfInimigo elfInimigo = new ElfInimigo(10);
		
		elfInimigo.tomarDano();
		
		System.out.println("A vida é "  + elfInimigo.vida);
*/
	}
}
