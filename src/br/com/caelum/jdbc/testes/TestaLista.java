package br.com.caelum.jdbc.testes;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	public static void main(String[] args) throws SQLException{
		ContatoDao dao = new ContatoDao();
		
		List<Contato> contatos = dao.Pesquisa(11);
		
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());
			String dataFormatada = new SimpleDateFormat("dd/MM/yyy").format(contato.getDataNascimento());
			System.out.println("Data de nascimento: " + dataFormatada + "\n");
		}
	}
}
