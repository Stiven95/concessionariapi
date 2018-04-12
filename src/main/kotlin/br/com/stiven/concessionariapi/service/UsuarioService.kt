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

    fun login(usuario: Usuario): Usuario {

        val usuarioLogin = usuarioRepository.findByUsuario(usuario.usuario)

        if(usuarioLogin.isNotEmpty()) {
            if (usuarioLogin.get(0).senha.equals(usuario.senha)) {
                return usuarioLogin.get(0)
            } else {
                return Usuario("", "", "", "")
            }
        }else{
            return Usuario("", "", "", "")
        }
    }

    fun salvar(usuario: Usuario) {
        usuarioRepository.save(usuario)
    }
}