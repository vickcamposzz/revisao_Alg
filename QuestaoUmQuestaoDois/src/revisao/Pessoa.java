package revisao;

public class Pessoa {
String nome;
Integer idade;

Pessoa(String nome, Integer idade){
	this.nome = nome;
	this.idade = idade;
	
}

void cumprimentar() {
	System.out.println("Seja bem vindo: " + nome);
	
}
}
