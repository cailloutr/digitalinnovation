package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Bank


fun main() {
    val digiOnebank = Bank(nome = "DigiOne", numero = 12)

    println(digiOnebank.nome)
    println(digiOnebank.numero)

    val banco2 = digiOnebank.copy(nome = "Banco2")

    println(banco2.info())
    println(banco2.numero)


}