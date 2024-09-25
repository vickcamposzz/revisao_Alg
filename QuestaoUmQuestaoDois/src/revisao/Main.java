package revisao;

public class Main {

	public static void main(String[] args) {
		 
		Pessoa pessoa1 = new Pessoa("Vitoria", 21);
		
		System.out.println("O nome e:" + pessoa1.nome);
		System.out.println("A idade e:" + pessoa1.idade);
		
		pessoa1.cumprimentar();
			
		

	}

}
