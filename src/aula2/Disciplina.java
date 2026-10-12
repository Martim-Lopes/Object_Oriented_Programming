
import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private String sigla;
	private int capacidade;
	
	private ArrayList<Inscricao> inscricoes;

	public Disciplina(String nome, String sigla, int capacidade) {
		this.nome = nome;
		this.sigla = sigla;
		this.capacidade = capacidade;
		inscricoes = new ArrayList<>(); 
	}
	
	public void inscrever(Aluno a) {
		
		if (inscricoes.size() >= capacidade) {
			System.err.println("Capacidade excedida: " + a.getNome() + " não foi inscrito(a)");
			return;
		}
		
		Inscricao insc = new Inscricao(a);
		inscricoes.add(insc);
	}


	public void desinscrever(int numero){

		inscricoes.remove(procurarInscricao(numero));

	}

	
	private Inscricao procurarInscricao(int numero) {
		
		for (Inscricao insc : inscricoes)
			if (insc.getAluno().getNumero() == numero)
				return insc;
		
		return null;
	}
	
	public void lancarNota(int numero, int nota) {	
		
		Inscricao insc = procurarInscricao(numero);	
		if (insc == null) 
			System.err.println("Aluno(a) no. " + numero + " não está inscrito(a) em " + sigla);
		else
			insc.setNota(nota);
	}

	public void nota(int numero){

		
	}
	
	@Override
	public String toString() {
		
		String aux = nome + " (" + sigla + ") - Cap: " + capacidade + "\n";
		for (Inscricao insc : inscricoes)
			aux += insc + "\n";
		return aux;
	}
}
