/*
        Paula simplesmente adora matemática. Seu maior passatempo é ficar inventando jogos ou atividades que a
     envolvam para brincar com seus amiguinhos. Obviamente, nem todos eles não são tão apaixonados assim por
     matemática e têm muita dificuldade para resolver as brincadeiras propostas por ela. Agora Paula inventou
     um pequeno passatempo que envolve 3 caracteres: um dígito numérico, uma letra e outro dígito numérico.
     Se a letra for maiúscula, deve-se subtrair o primeiro dígito do segundo. Se a letra for minúscula, deve-se
     somar ambos os dígitos e se os DÍGITOS forem iguais, deve-se desconsiderar a letra e mostrar o produto entre
     os dois dígitos. Ela pediu para seu amigo Marcelo, que é bom em programação, para criar um programa para que
     encontre a solução para cada uma das sequências que Paula lhe apresentar.
        Entrada
            A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N,
            indicando o número de casos de teste que virão a seguir. Cada caso de teste é uma sequência
            de três caracteres criada por Paula. Esta sequência contém na primeira posição um caractere
            de '0' a '9', na segunda posição uma letra maiúscula ou minúscula do alfabeto e na terceira
            posição outro caractere de '0' a '9'.

        Saída
            Para cada caso de teste, deve ser impressa uma linha com um valor inteiro que representa a solução
            da sequência proposta por Paula.

            Exemplo de Entrada	    Exemplo de Saída
                    4A5	                    1
                    3A3	                    9
                    4f2	                    6
                    2G4	                    2
                    7Z1                     -6

 */
fun main() {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        val input = readLine()!!
        val char1 = Character.getNumericValue(input[0])
        val char2 = input[1]
        val char3 = Character.getNumericValue((input[2]))

        if (char3 == char1){
            println(char3*char1)
        }else if (Character.isUpperCase(char2)) {
            println(char3 - char1)
        } else if (Character.isLowerCase(char2)) {
            println(char3 + char1)
        }

    }
}