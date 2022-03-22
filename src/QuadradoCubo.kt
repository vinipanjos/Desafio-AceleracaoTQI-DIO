/*
            Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000).
            Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
     Entrada:
            O arquivo de entrada contém um número inteiro positivo N.
            Exemplo de Entrada :
            5
     Saída:
            Imprima a saída conforme o exemplo fornecido.
            Exemplo de Saída :
            1 1 1
            2 4 8
            3 9 27
            4 16 64
            5 25 125
*/
fun main() {

    val N = readLine()!!.toInt()
    for (i in 1..N){
        println("$i ${i*i} ${i*i*i}")
    }

}