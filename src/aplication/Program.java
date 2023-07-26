package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Livro;
import services.CalcularPrecificacao;
import services.SistemaDePrecos;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Cadastro de novo livro:");
		System.out.print("ID: ");
		int id = sc.nextInt();
		System.out.print("Titulo: ");
		String titulo = sc.next();
		System.out.print("Preço Base: ");
		Double precoBase = sc.nextDouble();
		
		Livro livro = new Livro(id, precoBase, titulo);
		
		CalcularPrecificacao cp = new CalcularPrecificacao(new SistemaDePrecos());
		
		cp.addPrecario(livro);
		
		System.out.println(livro.getPrecificacao());
		
		sc.close();
		
	}

}
