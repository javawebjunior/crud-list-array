package classes;

import java.util.Objects;

public class Produto {

	private int idProduto;
	private String descricaoProduto;
	private int qtdProduto;
	private Double valorProduto;

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public Double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricaoProduto, idProduto, qtdProduto, valorProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(descricaoProduto, other.descricaoProduto) && idProduto == other.idProduto
				&& qtdProduto == other.qtdProduto && Objects.equals(valorProduto, other.valorProduto);
	}

}
