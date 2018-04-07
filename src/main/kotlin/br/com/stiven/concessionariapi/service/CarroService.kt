package br.com.stiven.concessionariapi.service

import br.com.stiven.concessionariapi.model.Carro
import br.com.stiven.concessionariapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService {

    @Autowired
    lateinit var carroRepository: CarroRepository

    fun buscarTodosCarros() : List<Carro> {
        return carroRepository.findAll()
    }

    fun buscaCarroPorAno(ano: Int) : List<Carro> {
        return carroRepository.findByAno(ano)
    }

    fun buscaCarroPorMarca(marca: String) : List<Carro> {
        return carroRepository.findByMarca(marca)
    }

    fun deletar(carro: Carro) {
        return carroRepository.delete(carro)
    }

    fun salvar(carro: Carro) {
        carroRepository.save(carro)
    }
}