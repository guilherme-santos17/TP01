package org.example.br.unisanta.model

import com.google.gson.annotations.SerializedName

class Endereco (@SerializedName("cep") val cep:String,
                @SerializedName("logradouro")val rua:String,
                @SerializedName("complemento") val numero:String,
                @SerializedName("bairro") val bairro:String,
                @SerializedName("localidade") val cidade:String,
                @SerializedName("uf")val estado:String) {


    override fun toString(): String {
        return "Endereco: $rua, nº $numero - $bairro, $cidade/$estado. CEP: $cep"
    }
}