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
import mack.entities.Usuario;

/**
 *
 * @author juliano.lopes
 */
public class BuscaController extends AbstractController {

    public void execute() {
        try {
            UsuarioDAO usuarios = getUsuarioDAO();
            int id = Integer.parseInt(this.getRequest().getParameter("id"));
            Usuario usuario = usuarios.buscaUsuarioPorId(id);
            this.setReturnPage("/resultado.jsp");
            this.getRequest().setAttribute("usuarioID", usuario);
        } catch (Exception ex) {
            Logger.getLogger(ListaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
