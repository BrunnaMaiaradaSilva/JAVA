
public class Exercicio9 {
	
	public int idade;
	
	public String classificaSenioridade(int idade) {
		idade = this.idade;
		
		if (idade >= 5 && idade <= 10) {
			return "Infantil";
		} if (idade >= 11 && idade <= 17) {
			return "Juvenil";
		} if (idade >= 18) {
			return "Senior";
		} else {
			return "Você ainda não pode participar";
		}
	}
}
