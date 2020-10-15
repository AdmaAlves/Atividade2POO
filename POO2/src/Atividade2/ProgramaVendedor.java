package Atividade2;

public class ProgramaVendedor {
	
	public static void main (String[]args) {
		Vendedor novo = new Vendedor("Adma","12345","Rua tal",900,5000,0.3);
		novo.setEndereco("Rua da arvore");
		novo.setComissão(0.25);
		novo.setSalario(1200);
		System.out.println(novo.toString());
		System.out.printf("Salário (+comissão): R$" +novo.CalcularSalario());
	}

}
