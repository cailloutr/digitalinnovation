package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main() {
    val maria = Gerente(nome = "Maria do Carmo", cpf = "00000000000", salario = 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}