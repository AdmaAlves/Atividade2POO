package Atividade2;

public class ProgramaAdministrador {
	
	public static void main (String[]args) {
		Administrador novo = new Administrador("Arthur Sales", "9999", "Rua Nova", 2300,800);
		novo.setSalario(2150);
		novo.setEndereco("Rua A");
		novo.setTelefone("8779");
		System.out.println(novo.toString());
		System.out.printf("Salário (+benefícios): R$" +novo.CalcularSalario());
	}

}
