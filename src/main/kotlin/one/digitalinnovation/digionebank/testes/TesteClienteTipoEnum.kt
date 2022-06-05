package one.digitalinnovation.digionebank.testes

import jdk.incubator.foreign.CLinker
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println(">>${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">>${pf.name} - ${pf.descricao}")
}