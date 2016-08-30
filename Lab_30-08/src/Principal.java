
public class Principal {

	public static void main(String[] args) {
		PartidaHandBall partida = new PartidaHandBall();
		
		partida.setArbitro("Sandro Meira Hith");
		partida.setFase("Fase de Grupos");
		
		partida.getJogadoresT1().add("Abner");
		partida.getJogadoresT1().add("Micael");
		partida.getJogadoresT1().add("Sávio");
		partida.getJogadoresT1().add("Jonathan");
		partida.getJogadoresT1().add("Fabricio");
		partida.getJogadoresT1().add("Rogerio");
		
		partida.getJogadoresT2().add("Bruno");
		partida.getJogadoresT2().add("Gugu");
		partida.getJogadoresT2().add("Silvio");
		partida.getJogadoresT2().add("Antero");
		partida.getJogadoresT2().add("Mário");
		partida.getJogadoresT2().add("Hudson");
		
		partida.setNumCartoesAmarelosT1(2);
		partida.setNumCartoesAmarelosT2(1);
		partida.setNumDoisMinutosT1(8);
		partida.setNumDoisMinutosT2(4);
		partida.setNumCartoesVermelhosT1(0);
		partida.setNumCartoesVermelhosT2(0);
		partida.setPlacarTime1(28);
		partida.setPlacarTime2(29);
		partida.getPlacarGeral();
	
		System.out.println(partida);

	}

}
