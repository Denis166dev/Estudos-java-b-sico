public class Operadores {
    public static void main(String[] args) {

        //OPERADORES ARITMÉTICOS

        int soma = 5 + 5; // operador de adição
        int sub = 10 - 5; // operador subtração
        int multi = 2 * 5; // operador de multiplicação
        int div = 10 / 2; // operador de divisão
        int resto = 10 % 2; // operador de módulo (ou resto da divisão)

        //OPERADOES DE INCREMENTO E DECREMENTO

        int numero = 5;
        numero++; // incrementa 1
        numero--; // decrementa 1

        int a = 5;
        int b = 5;

        // OPERADORES DE IGUALDADE

        boolean igual = a == b; // "=="Utilizado quando desejamos verificar se uma variável é igual a outra. (neste caso retornará true)
        boolean diferente = a != b; // "!=" Utilizado quando desejamos verificar se uma variável é diferente de outra. (neste caso retornará false)

        a = 7;
        b = 6;

        //OPERADORES RELACIONAIS

        boolean maior = a > b; // ">" Utilizado quando desejamos verificar se uma variável é maior que outra. (neste caso retornará true)
        boolean maiorIgual = a >= b; // ">=" Utilizado quando desejamos verificar se uma variável é maior ou igual a outra. (neste caso retornará true)

        boolean menor = a < b; // "<" Utilizado quando desejamos verificar se uma variável é menor que outra. (neste caso retornará false)
        boolean menorIgual = a <= b; // "<=" Utilizado quando desejamos verificar se uma variável é menor ou igual a outra. (neste caso retornará false)

        //OPERADORES LÓGICOS

        int num1 = 10;
        int num2 = 10;

        boolean doisIguais = num1 == 10 && num2 == 10; // "&&" Utilizado quando desejamos que as duas expressões sejam verdadeiras. (neste caso retornará true, pois a duas comparações são verdadeiras)
        boolean umIgual = num1 == 11 || num2 == 10; // "||" Utilizado quando precisamos que pelo meno um das expressões seja verdadeira. (neste caso retornará true, pois tem pelo menos uma condição verdadeira)
    }    
}
