
public class Teste {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana Santos", 1);
		Aluno a2 = new Aluno("Rui Leal", 2);
		Aluno a3 = new Aluno("Ricardo Rodrigues", 3);
		Aluno a4 = new Aluno("Beatriz Gomes", 4);
		
		Disciplina poo = new Disciplina("Programação Orientada para Objetos", "POO", 5);
		poo.inscrever(a1);
		poo.inscrever(a2);
		poo.inscrever(a3);
		poo.inscrever(a4);
		
		poo.lancarNota(5, 14); // msg de erro (não está inscrito)
				
		poo.lancarNota(2, 17);
		poo.lancarNota(3, 19);
		poo.lancarNota(4, 15);
		
		poo.lancarNota(1, 30); // msg de erro (nota inválida)
		
		System.out.println(poo);
	}
}
