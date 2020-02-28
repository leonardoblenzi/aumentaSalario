package Entities;

public class Employer {
	public String name;
	public double grossSalary;
	public double tax;
	
	//metodo para calcular salário liquido
	public double netSalary() {
		return grossSalary -= tax;
	}
	//método para aumentar o salário
	public void increaseSalary(double percentage) {
		/*salario recebe a taxa novamente para o porcentagem ser calculada com base no salario bruto
		 * ao final é diminuida a taxa para se transformar em salário liquido */
		grossSalary += tax;
		grossSalary += grossSalary*(percentage/100);
		grossSalary -= tax;
	}
}
