
public class Exercicio8 {

	public double nota1;
	public double nota2;
	public int totalAulas;
	public int aulasAssistidas;
	
	public boolean calculaMedia(double nota1, double nota2, int totalAulas, int aulasAssistidas) {
		nota1 = this.nota1;
		nota2 = this.nota2;
		totalAulas = this.totalAulas;
		aulasAssistidas = this.aulasAssistidas;
		
		double mediaAulas = totalAulas * 0.75;
		double mediaNotas = nota1 + nota2 / 2;
		
		if (aulasAssistidas * 0.75 >= mediaAulas && mediaNotas >= 6) {
			return true;
		} else {
			return false;
		}
	}
}
