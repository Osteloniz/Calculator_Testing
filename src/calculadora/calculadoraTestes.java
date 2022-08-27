package calculadora;

public class calculadoraTestes {

    public static void main(String[] args) {
        
        System.out.println("SOMA");
        //Cenario de teste de Soma:
        Soma calc = new Soma();
        //Cenario de teste 1: soma de dois valores 
        int soma = calc.somar(3, 7);
        System.out.println(soma);

        //Cenario de teste 2: Soma de dois valores  sendo um zero:
        soma = calc.somar(3, 0);
        System.out.println(soma);

        //Cenario teste 3:  soma de dois valores  sendo que ambos sao zero
        soma = calc.somar(0, 0);
        System.out.println(soma);

        //cenario teste 4: Soma de dois valores sendo um negativo e menor que o positivo 
        soma = calc.somar(3, -1);
        System.out.println(soma);
        
        //cenario teste 5: Soma de dois valores sendo ambos negativos
        soma = calc.somar(-7, -7);
        System.out.println(soma);
        
        //cenario teste 6: Soma de dois valores sendo um negativo maior que o positivo
        soma = calc.somar(3, -7);
        System.out.println(soma);
        
        
        /*----------------------------------SUBTRACAO------------------------------------*/
        System.out.println("SUBTRACAO");
        //Cenario de teste de Subtracao:
        Subtracao sub = new Subtracao();
        //Cenario de teste 1: Subtracao de dois valores:
        int subtracao = sub.subtracao(3, 7);
        System.out.println(subtracao);

        //Cenario de teste 2: Subtracao de dois valores sendo um zero:
        subtracao = sub.subtracao(3, 0);
        System.out.println(subtracao);

        //Cenario de teste 3: Subtracao de dois valores sendo ambos zero:
        subtracao = sub.subtracao(0, 0);
        System.out.println(subtracao);

        //Cenario de teste 4: Subtracao de dois valores sendo um negativo:
        subtracao = sub.subtracao(3, -1);
        System.out.println(subtracao);

        //outros cenarios
        /*Cenario de teste 3: Subtracao de dois valores sendo um zero porem em posicao diferente
        Alterando o resultado. do teste 2 que tem o numero 0 em outra posiçao*/
        subtracao = sub.subtracao(0,7);
        System.out.println(subtracao);
        
        //Cenario de teste 4: Subtracao de dois valores sendo ambos zero:
        subtracao = sub.subtracao(0,0);
        System.out.println(subtracao);
        
        //Cenario de teste 5: Subtracao de dois valores sendo um negativo:
        subtracao = sub.subtracao(40,-7);
        System.out.println(subtracao);
        
        //Cenario de teste 6: Subtracao de dois valores sendo ambos negativo:
        subtracao = sub.subtracao(-7,-7);
        System.out.println(subtracao);
        
        //Cenario de teste 7: Subtracao de dois valores sendo um negativo em posicao diferente:
        subtracao = sub.subtracao(-70,40);
        System.out.println(subtracao);
        
        //Cenario de teste 8: Subtracao de dois valores sendo um negativo em posicao diferente:
        subtracao = sub.subtracao(-7,40);
        System.out.println(subtracao);
        
        /*----------------------------------MULTIPLICACAO------------------------------------*/
        System.out.println("MULTIPLICAO");
        //Cenario de teste de multiplicao:
        Multiplicacao mult = new Multiplicacao();
        
        //Cenario de teste 1: multiplicacao de dois valores:
        int multiplicacao = mult.multiplicar(7, 21);
        System.out.println(multiplicacao);
        
        //Cenario de teste 2: multiplicacao de dois valores sendo um zero:
        multiplicacao = mult.multiplicar(257, 0);
        System.out.println(multiplicacao);
        
        //Cenario de teste 3: multiplicacao de dois valores sendo ambos zero:
        multiplicacao = mult.multiplicar(0, 0);
        System.out.println(multiplicacao);
        
        //Cenario de teste 4: multiplicacao de dois valores sendo um negativo:
        multiplicacao = mult.multiplicar(3, -1);
        System.out.println(multiplicacao);

        //Cenario de teste 5: multiplicacao de dois valores sendo um zero:
        multiplicacao = mult.multiplicar(75,0);
        System.out.println(multiplicacao);
        
        //Cenario de teste 6: multiplicacao de dois valores sendo um zero e outro negativo:
        multiplicacao = mult.multiplicar(-2,0);
        System.out.println(multiplicacao);
        
        //Cenario de teste 7: multiplicacao de dois valores sendo ambos negativos:
        multiplicacao = mult.multiplicar(-7,-7);
        System.out.println(multiplicacao);
        
        /*----------------------------------DIVISAO------------------------------------*/
        System.out.println("DIVISAO");
        //Cenario de teste de multiplicao:
        Divisao div = new Divisao();
        //Cenario de teste 1: divisao de dois valores:
        int divisao = div.dividir(21, 7);
        System.out.println(divisao);
        
        //Cenario de teste 2: divisao de dois valores  sendo que o divisor e zero:
        //divisao = div.dividir(3,0);
        //System.out.println(divisao);
        /*ERROR -> dessa forma a divisao nao pode ser realizada pelo divisor ser 0.
        Uma possivel solução para isso é coloca na Classe divisao um modo de validação 
        em que o (x, y) no caso o divisor (y) não pode ser valor zerado e apontar um aviso, 
        solicitando um numero valido para o calculo*/
        
        /*Cenario de teste 3: diisao de valores sendo que o divisor e menor que o dividendo:*/
        //divisao = div.dividir(21,7);
        //System.out.println(divisao);
        /*ERROR -> Uma correçao para isso seria mudar o tipo do parametro/varivel para float, para que seja 
        possivel ter numeros decimais no quociente*/
        
        //Cenario de teste 4: divisao de dois valores sendo ambos zero:
        //divisao = div.dividir(0, 0);
        //System.out.println(divisao);
        /*ERROR-> Se o dividendo e odivisor não tem nada como irá dividir, novamente a correção
        é um if com a verficação das informações inputados no codigo.*/
        
        
        //Cenario de teste 5: divisao de dois valores sendo um negativo:
        divisao = div.dividir(3, -1);
        System.out.println(divisao);
        
        
        //Cenario de teste 6: divisao de dois valores sendo um zero e outro negativo:
        //divisao = div.dividir(-2,0);
        //System.out.println(divisao);
        /*ERROR -> Mesma situação do teste 2 não é posivel realizar pelo divisor se 0 
        e pelo dividendo ser negativo. Possivel correção, na classe divisao criar um
        if{} para validar se os valores que estão sendo colocado pelo usuario 
        são validos para realizar a divisão*/
        
        //Cenario de teste 7: divisao de dois valores sendo ambos negativos:
        divisao = div.dividir(-7,-7);
        System.out.println(divisao);
    }
}
