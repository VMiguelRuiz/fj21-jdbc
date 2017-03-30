package br.com.caelum.jdbc.testes;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;
import javax.swing.*;

public class TestaInsere {
	public static void main(String[] args) throws SQLException{
		Contato contato = new Contato();
		
		String nome = JOptionPane.showInputDialog("Nome");
		String email = JOptionPane.showInputDialog("Email");
		String endereco = JOptionPane.showInputDialog("Endereco");
		
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		
		//dao.adiciona(contato);
		//dao.Pesquisa(12);
		//dao.altera(contato);
		//dao.remove(contato);
	}
}
