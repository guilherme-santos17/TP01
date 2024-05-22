package org.example

import com.google.gson.Gson
import org.example.br.unisanta.model.Endereco
import org.example.br.unisanta.services.ConsomeAPI


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Digite seu cep: ")
    val cep = readln()

    val consome = ConsomeAPI()
    val json = consome.obterDados("https://viacep.com.br/ws/$cep/json/")
    //println(json)

    val gson = Gson()
    val meuEndereco = gson.fromJson(json,Endereco::class.java)

    println(meuEndereco)
}