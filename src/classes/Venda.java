package classes;

import java.util.Objects;

public class Venda {

	private int id;
	private Cliente cliente;
	private Produto produto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, id, produto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(cliente, other.cliente) && id == other.id && Objects.equals(produto, other.produto);
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", cliente=" + cliente + ", produto=" + produto + "]";
	}

}
