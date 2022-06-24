package classes;

import java.util.Objects;

public class Cliente {

	private int idCliente;
	private String nomeCliente;
	private String contatoCliente;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getContatoCliente() {
		return contatoCliente;
	}

	public void setContatoCliente(String contatoCliente) {
		this.contatoCliente = contatoCliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contatoCliente, idCliente, nomeCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(contatoCliente, other.contatoCliente) && idCliente == other.idCliente
				&& Objects.equals(nomeCliente, other.nomeCliente);
	}

}
