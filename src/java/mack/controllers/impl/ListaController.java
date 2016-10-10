package mack.controllers.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import static mack.dao.usuario.UsuarioDAOFactory.getUsuarioDAO;
import mack.entities.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author juliano.lopes
 */
public class ListaController extends AbstractController {

    public void execute() {
        try {
            //List usuarios = new ArrayList<Usuario>();
            //usuarios.add(new Usuario(1, "Mack", "Junior"));
            //usuarios.add(new Usuario(2, "Mack", "Neto"));
            //this.setReturnPage("/index.jsp");
            //this.getRequest().setAttribute("usuarios", usuarios);
            UsuarioDAO usuarios = getUsuarioDAO();
            Collection cUsuarios = usuarios.buscaTodosUsuarios();
            this.setReturnPage("/index.jsp");
            this.getRequest().setAttribute("usuarios", cUsuarios);
        } catch (Exception ex) {
            Logger.getLogger(ListaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
