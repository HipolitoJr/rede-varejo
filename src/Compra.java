import java.util.List;

public class Compra {
	
	private float valor;
	private Cliente cliente;
	private List<ItemCompra> itens;
	private Promocao promocao;
	
	public Compra(float valor, Cliente cliente, Promocao promocao) {
		this.valor = valor;
		this.cliente = cliente;
		this.promocao = promocao;
	}

	public float getValor() {
		return valor;
	}
	
	public float calculaValorTotal(DefinirDesconto descontos) {
		float totalDescontos = descontos.somadorDescontos();
		
		return valor - totalDescontos;
	}
}
