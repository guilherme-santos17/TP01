package org.example.br.unisanta.services

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers

class ConsomeAPI {
    fun obterDados(url:String):String{
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build()
        val response = client
            .send(request, BodyHandlers.ofString())

        val json = response.body()

        return json
    }
}