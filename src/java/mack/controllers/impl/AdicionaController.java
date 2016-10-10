/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.controllers.impl;

import mack.controllers.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import static mack.dao.usuario.UsuarioDAOFactory.getUsuarioDAO;
import mack.entities.Usuario;

/**
 *
 * @author juliano.lopes
 */
public class AdicionaController extends AbstractController {

    public void execute() {

        UsuarioDAO usuario = getUsuarioDAO();
        String nome = this.getRequest().getParameter("nome");
        String sobrenome = this.getRequest().getParameter("sobrenome");
        Usuario novoUsuario = usuario.criaUsuario(nome, sobrenome);
        this.setReturnPage("/resultadoAdiciona.jsp");
        this.getRequest().setAttribute("usuario", novoUsuario);
    }
}
