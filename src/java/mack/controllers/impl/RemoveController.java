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
public class RemoveController extends AbstractController {

    @Override
    public void execute() {
        try {
            UsuarioDAO usuarios = getUsuarioDAO();
            int id = Integer.parseInt(this.getRequest().getParameter("idRem"));
            usuarios.removeUsuario(id);
            boolean res = true;
            this.setReturnPage("/resultadoRemove.jsp");
            this.getRequest().setAttribute("idRem", res);
        } catch (UsuarioNaoEncontradoException ex) {
            Logger.getLogger(RemoveController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
