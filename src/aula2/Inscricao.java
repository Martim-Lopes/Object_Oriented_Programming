
public class Inscricao {
	
	private Aluno aluno;
	private int nota;
	
	// Constante usada para representar uma nota não atribuída 
	public static int NA = -1;
	
	public Inscricao(Aluno aluno) {
		this.aluno = aluno;
		nota = NA;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public int getNota() {
		return nota;
	}
	
	public boolean temNota() {
		return nota != NA;
	}
	
	public void setNota(int nota) {
		if ( (nota < 0 || nota > 20) && nota != NA) {
			System.err.println("Atribuição de nota inválida a " + aluno);
			return;
		}
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		
		if (nota != NA)
			return aluno + " - " + nota + " valores";
		return aluno + " - NA";
		
		// em alternativa podia-se usar o operador ternário (um género de if-else inline)
		// return aluno + " - " + (temNota()? nota + " valores" : "NA");
	}
	
	
}
