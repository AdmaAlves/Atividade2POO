package Atividade2;

public class ProgramaFornecedor {
	
	public static void main(String[]args) {
		
		Fornecedor novo = new Fornecedor("Julio","1234","Rua x",1500,600);
		novo.setNome("Julio Mendonza");
		novo.setTelefone("9887");
		novo.setEndereco("Rua da praça");
		System.out.println(novo.toString());
		System.out.println("Crédito: R$" +novo.getValorCredito()+"     Dívida: R$"+novo.getValorDivida());
		System.out.printf("Saldo: R$" +novo.obterSaldo());
	}
}
