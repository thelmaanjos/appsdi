package br.edu.infnet.appsdi.tp4;

public class Funcionario 
{
	private String nome;
	private String email;
	private float salario;
	private int idade;
	
	// Funcionario func1 = new Funcionario();
	// func1.setNome("thelma");
	// func1.setEmail("thel@thel.com");
	// func1.setSalario(1000);
	// func1.setIdade(10)
	
	// Funcionario func2 = new Funcionario("thelma", "thel@thel.com");
	// func2.setSalario(1000);
	// func2.setIdade(20);
	
	//Funcionario func3 = new Funcionario("thelma", "thel@thel.com", 3000, 30);
	
	// sobrecarga de construtores
	public Funcionario(String nome, String email, float salario, int idade)
	{
		this(nome, email);
		this.salario = salario;
		this.idade = idade;
	}
	
	// sobrecarga de construtores
	public Funcionario(String nome, String email)
	{
		this();
		this.nome = nome;
		this.email = email;
	}
	
	// construtor padrão (sem parâmetros)
	public Funcionario()
	{
		this.salario = 999;
		this.idade = 99;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public float getSalario() 
	{
		return salario;
	}
	
	public void setSalario(float salario) 
	{
		this.salario = salario;
	}
	
	public int getIdade() 
	{
		return idade;
	}
	
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return nome + " - " + email + " - " + salario + " - " + idade;
	}
	
	public void impressao()
	{
		System.out.println("Funcionário foi cadastrado com sucesso: " + this + ".");
	}
}

