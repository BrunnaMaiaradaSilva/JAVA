
public class Exercicio1 {
	public double litros;
	public char tipo;

	public double calculaDesconto(double litros, char tipo) {
		litros = this.litros;
		tipo = this.tipo;

		if (tipo == 'A' && litros <= 20) {
			return litros * 2.90 - (2.90 * 0.03);
		}
		if (tipo == 'A' && litros > 20) {
			return litros * 2.90 - (2.90 * 0.05);
		}
		if (tipo == 'G' && litros <= 20) {
			return litros * 3.30 - (3.30 * 0.04);
		} else {
			return litros * 3.30 - (3.30 * 0.06);
		}
	}
}
