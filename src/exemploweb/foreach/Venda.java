package exemploweb.foreach;

import java.math.BigDecimal;

public class Venda {
	

	private String vendedor;
	private BigDecimal valor;
	private Integer mes;
	private String uf;

	public Venda() {
	}

	public Venda(String vendedor, BigDecimal valor, Integer mes, String uf) {
		super();
		this.vendedor = vendedor;
		this.valor = valor;
		this.mes = mes;
		this.uf = uf;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
}
