package br.com.stiven.concessionariapi.controller

import br.com.stiven.concessionariapi.model.Usuario
import br.com.stiven.concessionariapi.service.UsuarioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usuario")
class UsuarioController {

    @Autowired
    lateinit var usuarioService: UsuarioService

    @GetMapping
    fun buscarTodos() :List<Usuario> {
        return usuarioService.buscaTodosUsuarios()
    }

    @PostMapping
    fun salvar(@RequestBody usuario: Usuario) {
        usuarioService.salvar(usuario)
    }

}