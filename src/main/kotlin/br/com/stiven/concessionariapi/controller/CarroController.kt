package br.com.stiven.concessionariapi.controller

import br.com.stiven.concessionariapi.model.Carro
import br.com.stiven.concessionariapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carro")
class CarroController {

    @Autowired
    lateinit var carroService: CarroService

    @GetMapping
    fun buscarTodos() :List<Carro> {
        return carroService.buscarTodosCarros()
    }

    @PostMapping
    fun salvar(@RequestBody carro: Carro) {
        carroService.salvar(carro)
    }

}