package br.edu.infnet.appsdi.tp4;

public class FuncionarioTeste 
{
	public static void main(String[] args) 
	{
		Funcionario func1 = new Funcionario();
		func1.setNome("huguinho");
		func1.setEmail("hug@hug.com");
		func1.setSalario(1000);
		func1.setIdade(20);
		func1.impressao();
		
		Funcionario func2 = new Funcionario("zezinho", "zez@zez.com");
		func2.setSalario(2000);
		func2.setIdade(25);
		func2.impressao();

		Funcionario func3 = new Funcionario("luizinho", "luiz@luiz.com", 3000, 30);
		func3.impressao();
		
		Funcionario func4 = new Funcionario();
		func4.setNome("margarida");
		func4.setEmail("marg@marg.com");
		func4.impressao();
		
		Funcionario func5 = new Funcionario("donald", "don@don.com");
		func5.impressao();
	}
}