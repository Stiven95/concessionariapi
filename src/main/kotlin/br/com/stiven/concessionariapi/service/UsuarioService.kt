package br.com.stiven.concessionariapi.service

import br.com.stiven.concessionariapi.model.Usuario
import br.com.stiven.concessionariapi.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsuarioService {

    @Autowired
    lateinit var usuarioRepository: UsuarioRepository

    fun buscaTodosUsuarios() : List<Usuario> {
        return usuarioRepository.findAll()
    }

    fun buscaPorUsuario(usuario: String) : Usuario {
        return usuarioRepository.findByUsuario(usuario)
    }

    fun salvar(usuario: Usuario) {
        usuarioRepository.save(usuario)
    }
}