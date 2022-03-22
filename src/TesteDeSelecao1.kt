/*
        Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A,
        e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A
        for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
        Entrada: Quatro números inteiros A, B, C e D.
        Saída: Mostre a respectiva mensagem após a validação dos valores.

            Exemplos de entrada:
            5 6 7 8
            2 3 2 6

            Exemplos de Saída:
            Valores nao aceitos
            Valores aceitos
*/
import java.util.Scanner

fun main() {
        //opção 1 :
        /*val input = Scanner(System.`in`)
        val a = input.nextInt()
        val b = input.nextInt()
        val c = input.nextInt()
        val d = input.nextInt()*/
        
        //opção 2 :
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        val c = readLine()!!.toInt()
        val d = readLine()!!.toInt()

        if ( b > c && d  > a  && (c + d) > (a + b) &&  c > 0 &&  d > 0 && a % 2 ==0 ) {
            println("Valores aceitos")
        } else {
            println("Valores nao aceitos")
        }

    }
