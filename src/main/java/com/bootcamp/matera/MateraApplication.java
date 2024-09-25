package com.bootcamp.matera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class MateraApplication {

	public static void main(String[] args) {

/*		Conta poupanca = new ContaPoupanca();
		poupanca.setSaldo(123.45);
		poupanca.imprimeExtrato();

		Conta corrente = new ContaCorrente();
		corrente.setSaldo(678.90);
		corrente.imprimeExtrato();

		Conta.imprimeTitulo();

		Conta[] contas = {new ContaCorrente(), new ContaPoupanca()};

		for (Conta conta : contas) {
			conta.imprimeExtrato();
		} */

		List<Integer> numeros = new ArrayList<>();

		numeros.add(1);
		numeros.add(2);
		numeros.add(5);
		numeros.add(3);
		numeros.add(8);

/*		for (Integer numero : numeros) {
			System.out.println(numero);
		}
*/
/*		List <Integer> sortedList = numeros.stream()
//				.forEach(numero -> System.out.println(numero));
				.filter(numero -> numero >2)

				.sorted()
				.toList();

		System.out.println(sortedList);

		MisContas misContas = new MisContas();
		System.out.println(misContas.quantidadeDeContas());
*/

		Optional<Integer> optNumero = numeros.stream()
				.filter(numero -> numero > 2)
				.findFirst();

/*		if (optNumero.isPresent()) {

			Integer numero = optNumero.get();

			System.out.println(numero);
		}
 */

		System.out.println(optNumero.isPresent());



		///SpringApplication.run(MateraApplication.class, args);
	}

}
