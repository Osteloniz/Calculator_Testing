package calculadora;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

class CalculadoraJunitTest {

	/*--------------------Soma--------------------------*/

	@SuppressWarnings("deprecation")
	@Test
	public void SomarJunit() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);

		Assert.assertEquals(10, soma);
	}

	/*--------------------Subtração--------------------------*/

	@SuppressWarnings("deprecation")
	@Test
	public void SubJunit() {
		Calculadora calcs = new Calculadora();
		int sub = calcs.subtrair(3, 7);

		Assert.assertEquals(-4, sub);

		// Cenario de teste 1: subtracao de dois valores:
		sub = calcs.subtrair(3, 7);
		Assert.assertEquals(-4, sub);

		// Cenario de teste 2: subctracao de dois valores sendo um zero:
		sub = calcs.subtrair(3, 0);
		Assert.assertEquals(3, sub);

		// Cenario de teste 3: subtracao de dois valores sendo ambos zero:
		sub = calcs.subtrair(0, 0);
		Assert.assertEquals(0, sub);

		// Cenario de teste 4: subtracao de dois valores sendo um negativo:
		sub = calcs.subtrair(3, -1);
		Assert.assertEquals(4, sub);

		// outros cenarios
		/*
		 * Cenario de teste 5: subtracao de dois valores sendo um zero porem em posicao
		 * diferente Alterando o resultado. do teste 2 que tem o numero 0 em outra
		 * posiçao
		 */
		sub = calcs.subtrair(0, 7);
		Assert.assertEquals(-7, sub);

		// Cenario de teste 6: subtracao de dois valores sendo um negativo:
		sub = calcs.subtrair(40, -7);
		Assert.assertEquals(47, sub);

		// Cenario de teste 7: subtracao de dois valores sendo ambos negativo:
		sub = calcs.subtrair(-7, -7);
		Assert.assertEquals(0, sub);

		// Cenario de teste 8: subtracao de dois valores sendo um negativo em posicao
		// diferente:
		sub = calcs.subtrair(-70, 40);
		Assert.assertEquals(-110, sub);

		// Cenario de teste 9: subtracao de dois valores sendo um negativo em posicao
		// diferente:
		sub = calcs.subtrair(-7, 40);
		Assert.assertEquals(-47, sub);

	}

	/*------------------Multiplicação--------------------------*/
	@SuppressWarnings("deprecation")
	@Test
	public void MultJunit() {
		Calculadora calcm = new Calculadora();
		//cenario de teste 0: multiplicação de dois valores:
		int mult = calcm.multiplicar(3, 7);

		Assert.assertEquals(21, mult);

		// Cenario de teste 1: multiplicacao de dois valores:
		mult = calcm.multiplicar(7, 21);
		Assert.assertEquals(147, mult);

		// Cenario de teste 2: multiplicacao de dois valores sendo um zero:
		mult = calcm.multiplicar(257, 0);
		Assert.assertEquals(0, mult);

		// Cenario de teste 3: multiplicacao de dois valores sendo ambos zero:
		mult = calcm.multiplicar(0, 0);
		Assert.assertEquals(0, mult);

		// Cenario de teste 4: multiplicacao de dois valores sendo um negativo:
		mult = calcm.multiplicar(3, -1);
		Assert.assertEquals(-3, mult);

		// Cenario de teste 6: multiplicacao de dois valores sendo um zero e outro
		// negativo:
		mult = calcm.multiplicar(-2, 0);
		Assert.assertEquals(0, mult);

		// Cenario de teste 7: multiplicacao de dois valores sendo ambos negativos:
		mult = calcm.multiplicar(-7, -7);
		Assert.assertEquals(49, mult);

	}

	/*-----------------------Divisão--------------------------*/
	@SuppressWarnings("deprecation")
	@Test
	

	public void DivtDoisNumerosPositivos() {
		Calculadora calcd = new Calculadora();
		
		//Cenario de teste 1: divisao de dois valores:
        int div = calcd.dividir(21, 7);
        Assert.assertEquals(3, div);
        
        //Cenario de teste 2: divisao de dois valores  sendo que o divisor e zero:
        //div = calcd.dividir(3,0);
        //ssert.assertEquals(0, div);
		
        /*ERROR -> dessa forma a divisao nao pode ser realizada pelo divisor ser 0.
        Uma possivel solução para isso é coloca na Classe divisao um modo de validação 
        em que o (x, y) no caso o divisor (y) não pode ser valor zerado e apontar um aviso, 
        solicitando um numero valido para o calculo*/
        //Assert.assertEquals(0, div);
		
        /*Cenario de teste 3: diisao de valores sendo que o divisor e menor que o dividendo:*/
        //div = calcd.dividir(21,7);
        //Assert.assertEquals(0, div);
		
        /*ERROR -> Uma correçao para isso seria mudar o tipo do parametro/varivel para float, para que seja 
        possivel ter numeros decimais no quociente*/
        //Assert.assertEquals(0, div);
		
        //Cenario de teste 4: divisao de dois valores sendo ambos zero:
        //div = calcd.dividir(0, 0);
        //Assert.assertEquals(0, div);
		
        /*ERROR-> Se o dividendo e odivisor não tem nada como irá dividir, novamente a correção
        é um if com a verficação das informações inputados no codigo.*/
        
        //Cenario de teste 5: divisao de dois valores sendo um negativo:
        div = calcd.dividir(3, -1);
        Assert.assertEquals(-3, div);
        
        //Cenario de teste 6: divisao de dois valores sendo um zero e outro negativo:
        //div = calcd.dividir(-2,0);
        //Assert.assertEquals(0, div);
		
        /*ERROR -> Mesma situação do teste 2 não é posivel realizar pelo divisor se 0 
        e pelo dividendo ser negativo. Possivel correção, na classe divisao criar um
        if{} para validar se os valores que estão sendo colocado pelo usuario 
        são validos para realizar a divisão*/
        //Assert.assertEquals(0, div);
		
        //Cenario de teste 7: divisao de dois valores sendo ambos negativos:
        div = calcd.dividir(-7,-7);
        Assert.assertEquals(1, div);
		
		
	}

}
