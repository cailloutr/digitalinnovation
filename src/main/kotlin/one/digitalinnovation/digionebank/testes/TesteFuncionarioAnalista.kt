package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main() {
    val joao = Analista(nome = "Joao Pedro", cpf = "1231231236", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)

}
