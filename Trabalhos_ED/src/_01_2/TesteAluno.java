/*
Considerando as declarações abaixo para representar o cadastro de grupo de
alunos de diferentes turmas, implemente funções para criar e imprimir o cadastro.
struct aluno {
char nome[85];
char matricula[8];
char turma;
float p5;
float p2;
float p3;
}; typedef struct aluno Aluno;
- Implemente como no exercício anterior
- Implemente uma função que tenha como valor de retorno a média final obtida
pelos os alunos de uma determinada turma. A nota final de cada aluno é dada
pela média das três provas.
float media_turma (int n, Aluno** turmas, char turma);
 */

package _01_2;

import java.util.ArrayList;

public class TesteAluno {
	private static ArrayList<Aluno> alunos = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		Aluno a6 = new Aluno();
		
		a1.setMatricula("1");
		a1.setNome("a1");
		a1.setTurma("turma1");
		a1.setP1(10);
		a1.setP2(9);
		a1.setP3(8);
		a1.setMedia();
		alunos.add(a1);
		
		a2.setMatricula("2");
		a2.setNome("a2");
		a2.setTurma("turma2");
		a2.setP1(2);
		a2.setP2(9);
		a2.setP3(8);
		a2.setMedia();
		alunos.add(a2);
		
		a3.setMatricula("3");
		a3.setNome("a3");
		a3.setTurma("turma1");
		a3.setP1(3);
		a3.setP2(9);
		a3.setP3(8);
		a3.setMedia();
		alunos.add(a3);
		
		a4.setMatricula("4");
		a4.setNome("a4");
		a4.setTurma("turma1");
		a4.setP1(4);
		a4.setP2(9);
		a4.setP3(8);
		a4.setMedia();
		alunos.add(a4);
		
		a5.setMatricula("5");
		a5.setNome("a5");
		a5.setTurma("turma2");
		a5.setP1(5);
		a5.setP2(9);
		a5.setP3(8);
		a5.setMedia();
		alunos.add(a5);
		
		a6.setMatricula("6");
		a6.setNome("a6");
		a6.setTurma("turma2");
		a6.setP1(6);
		a6.setP2(9);
		a6.setP3(8);
		a6.setMedia();
		alunos.add(a6);
		
		
		int cont = 0, i = 0;
		float soma = 0, mediaTurma = 0;
		while(i < alunos.size()){
			if(alunos.get(i).getTurma().equals("turma1")){
				soma += alunos.get(i).getMedia();
				cont++;
			}
			i++;
		}
		mediaTurma = soma/cont;
		
		System.out.println("A média da turma é: " + mediaTurma);
	}

}
