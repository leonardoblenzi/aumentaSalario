package Application;
import java.util.Scanner;
import Entities.Employer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//criando o objeto
		Employer employer;
		employer = new Employer();
		System.out.println("Informe seu nome: ");
		employer.name = sc.next();
		System.out.println("Informe seu salário bruto: ");
		employer.grossSalary = sc.nextDouble();
		System.out.println("Informe a taxa de imposto: ");
		employer.tax = sc.nextDouble();
		
		
		System.out.println("Nome: " + employer.name + "\nSalario liquido: " + employer.netSalary() +
				"\nImposto: "
				+ employer.tax);
		
		System.out.println("Gostaria de aumentar o salário em qual porcentagem?: ");
		double percentage;
		percentage = sc.nextDouble();
		employer.increaseSalary(percentage);
		
		System.out.println("------------------------------");
		System.out.println("Dados atualizados: " + employer.name + " R$ " + employer.grossSalary);
		
		sc.close();
	}

}
