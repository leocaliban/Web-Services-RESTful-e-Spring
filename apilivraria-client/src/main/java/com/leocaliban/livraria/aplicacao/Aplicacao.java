package com.leocaliban.livraria.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.leocaliban.livraria.client.LivrosClient;
import com.leocaliban.livraria.client.domain.Livro;

public class Aplicacao {
	
	public static void main(String[] args) throws ParseException {
		
		LivrosClient client = new LivrosClient("http://localhost:8080","usuario","123");
		List<Livro> listaLivros = client.listar();
		
		for (Livro livro : listaLivros) {
			System.out.println("Livro: " + livro.getNome());
		}
		
		Livro livro = new Livro();
		livro.setNome("TESTE API");
		livro.setEditora("Leocaliban");
		SimpleDateFormat publicacao = new SimpleDateFormat("dd/MM/yyyy");
		livro.setDataPublicacao(publicacao.parse("01/02/2013"));
		livro.setResumo("Livro novo testando salvar na API");
		
		String localizacao = client.salvar(livro);
		System.out.println("URI Do livro salvo: " + localizacao);
		
		Livro livroBuscado = client.buscar(localizacao);
		System.out.println("Livro buscado: " + livroBuscado.getNome());
	}
}
