/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.controllers.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import static mack.dao.usuario.UsuarioDAOFactory.getUsuarioDAO;
import mack.dao.usuario.UsuarioNaoEncontradoException;

/**
 *
 * @author juliano.lopes
 */
public class AtualizaController extends AbstractController {

    public void execute() {
        UsuarioDAO usuario = getUsuarioDAO();
        int id = Integer.parseInt(this.getRequest().getParameter("idAtualiza"));
        String nome = this.getRequest().getParameter("nomeAtualiza");
        String sobrenome = this.getRequest().getParameter("sobrenomeAtualiza");
        try {
            usuario.updateUsuario(id, nome, sobrenome);
            boolean res = true;
            this.setReturnPage("/resultadoAtualiza.jsp");
            this.getRequest().setAttribute("res", res);
        } catch (UsuarioNaoEncontradoException ex) {
            Logger.getLogger(AtualizaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
