package br.com.stiven.concessionariapi.repository

import br.com.stiven.concessionariapi.model.Carro
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CarroRepository : MongoRepository<Carro, String> {
    fun findByAno(ano: Int) : List<Carro>
    fun findByMarca(marca: String) : List<Carro>
    fun findById(id: Int): Carro
}