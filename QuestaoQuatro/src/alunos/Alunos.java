package alunos;

public class Alunos {
String nome;
double nota1;
double nota2;

Alunos(String nome, double nota1, double nota2){
	this.nome = nome;
	this.nota1 = nota1;
	this.nota2 = nota2;
}
 double calcularMedia() {
 	return (nota1 + nota2) / 2;

}
 boolean resultado() {
	 return calcularMedia() >= 7;

 }
 
void exibir() {
	System.out.println("nome: " + nome);
	System.out.println("media: " + (calcularMedia()));
	System.out.println("resultado: " + (resultado() ? "APROVADO" : "REPROVADO"));
}
 
}

