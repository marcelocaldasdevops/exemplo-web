package exemploweb.apptestes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import exemploweb.foreach.Venda;

public class App {
	
public static void main( String[] args ){
    	
    	List<Venda> listaVendas = getVendas();
    	
    	System.out.printf("%-15s", "Vendedor");
    	System.out.printf("%-15s", "Valor");
    	System.out.printf("%-15s", "UF");
    	System.out.println();
    	
    	listaVendas.forEach(venda -> {
    		System.out.printf("%-15s", venda.getVendedor());
    		System.out.printf("%-15.2f", venda.getValor());
    		System.out.printf("%-15s", venda.getUf());
    		System.out.println();
    	});
    	
    	System.out.println("\nSomentes as vendas do estado de GO");
    	
    	listaVendas.stream().filter(venda -> venda.getUf().equals("GO")).forEach(venda -> {
    		System.out.printf("%-15s", venda.getVendedor());
    		System.out.printf("%-15.2f", venda.getValor());
    		System.out.printf("%-15s", venda.getUf());
    		System.out.println();
    		}
    	);
    	
    	System.out.println("\nSomentes as vendas maior de 90");
    	
    	listaVendas.stream().filter(venda -> venda.getValor().longValue() > 90).forEach(venda -> {
    		System.out.printf("%-15s", venda.getVendedor());
    		System.out.printf("%-15.2f", venda.getValor());
    		System.out.printf("%-15s", venda.getUf());
    		System.out.println();
    		}
    	);
    	
    	System.out.println("\nSomentes as vendas que o Vendedor contenha a letra H");
    	
    	listaVendas.stream().filter(venda -> venda.getVendedor().toLowerCase().contains("h")).forEach(venda -> {
    		System.out.printf("%-15s", venda.getVendedor());
    		System.out.printf("%-15.2f", venda.getValor());
    		System.out.printf("%-15s", venda.getUf());
    		System.out.println();
    		}
    	);
    	
    	
    	System.out.println("\nSomentes as vendas do mês 2");
    	
    	listaVendas.stream().filter(venda -> venda.getMes().compareTo(2)==0).forEach(venda -> {
    		System.out.printf("%-15s", venda.getVendedor());
    		System.out.printf("%-15.2f", venda.getValor());
    		System.out.printf("%-15s", venda.getUf());
    		System.out.println();
    		}
    	);
    	
    	System.out.println("\nQuantidade de vendas do estado de GO");
    	
    	Long qntVendasGO = listaVendas.stream().filter(venda -> venda.getUf().equals("GO")).count();
    	System.out.println(qntVendasGO);
    	
    	System.out.println("\nSoma total das vendas de GO");
    	BigDecimal somaTotalDasVendasGO = listaVendas.stream()
    			.filter(venda -> venda.getUf().equals("GO"))
    			.map(Venda::getValor)
    			.reduce(BigDecimal.ZERO, BigDecimal::add);
    	System.out.println(somaTotalDasVendasGO);
    	
    }
    
    public static List<Venda> getVendas(){
    	List<Venda> listaVendas = new ArrayList<>();
    	listaVendas.add(new Venda("Henrique", new BigDecimal(10), 2, "GO"));
    	listaVendas.add(new Venda("Herbert", new BigDecimal(10), 2, "BA"));
    	listaVendas.add(new Venda("Rodrigo", new BigDecimal(90), 10, "DF"));
    	listaVendas.add(new Venda("Julia", new BigDecimal(100), 12, "GO"));
    	listaVendas.add(new Venda("Ana", new BigDecimal(101), 2, "SP"));
    	return listaVendas;
    }
}
