package executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Cliente;
import classes.Produto;

public class Main {

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<>();
		List<Produto> produtos = new ArrayList<>();

		// ==================== Create ====================

		for (int qtd = 1; qtd <= 1; qtd++) {

			int adicionarCliente = 0;
			while (adicionarCliente == 0) {

				String idCliente = JOptionPane.showInputDialog("ID CLIENTE: ");
				String nomeCliente = JOptionPane.showInputDialog("NOME CLIENTE: ");
				String contatoCliente = JOptionPane.showInputDialog("CONTATO CLIENTE: ");

				Cliente cliente = new Cliente();
				cliente.setIdCliente(Integer.parseInt(idCliente));
				cliente.setNomeCliente(nomeCliente);
				cliente.setContatoCliente(contatoCliente);

				clientes.add(cliente);

				int continuarAdicionando = JOptionPane.showConfirmDialog(null, "Adicionar um novo Cliente ?");
				adicionarCliente = continuarAdicionando;
			}

		}

		for (int qtd = 1; qtd <= 1; qtd++) {

			int adicionarProduto = 0;
			while (adicionarProduto == 0) {

				String idProduto = JOptionPane.showInputDialog("ID PRODUTO: ");
				String descricaoProduto = JOptionPane.showInputDialog("DESCRICAO PRODUTO: ");
				String qtdProduto = JOptionPane.showInputDialog("QTD PRODUTO: ");
				String valorProduto = JOptionPane.showInputDialog("VALOR PRODUTO: ");

				Produto produto = new Produto();
				produto.setIdProduto(Integer.parseInt(idProduto));
				produto.setDescricaoProduto(descricaoProduto);
				produto.setQtdProduto(Integer.parseInt(qtdProduto));
				produto.setValorProduto(Double.parseDouble(valorProduto));

				produtos.add(produto);

				int continuarAdicionando = JOptionPane.showConfirmDialog(null, "Adicionar um novo Produto ?");
				adicionarProduto = continuarAdicionando;

			}
		}
		
		// ==================== Read =====================
		// ==================== Update ===================
		// ==================== Delete ===================

		// ==================== SAÍDA DE DADOS ====================

		System.out.println("LISTA DE CLIENTE CADASTRADOS \n");

		for (Cliente cliente : clientes) {

			System.out.println("ID CLIENTE: " + cliente.getIdCliente());
			System.out.println("NOME CLIENTE: " + cliente.getNomeCliente());
			System.out.println("CONTATO CLIENTE: " + cliente.getContatoCliente());
			System.out.println("_________________________________________________\n");
		}

		for (Produto produto : produtos) {

			System.out.println("ID PRODUTO: " + produto.getIdProduto());
			System.out.println("DESCRIÇÃO PRODUTO: " + produto.getDescricaoProduto());
			System.out.println("QTD PRODUTO: " + produto.getQtdProduto());
			System.out.println("VALOR PRODUTO: " + produto.getValorProduto());
			System.out.println("_________________________________________________\n");
		}

	}

}
