/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.dao.usuario;

/**
 *
 * @author juliano.lopes
 */
public final class UsuarioDAOFactory {

    private UsuarioDAOFactory() {
    }

    public static UsuarioDAO getUsuarioDAO() {
        return new UsuarioDAOImpl();
    }
}
