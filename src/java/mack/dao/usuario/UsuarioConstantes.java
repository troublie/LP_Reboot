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
final class UsuarioConstantes {

    static public final String URL = "jdbc:derby://localhost:1527/meuDB";
    static public final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static public final String USER = "admin";
    static public final String PASSWORD = "admin";
    static public final String USUARIO_TABLE_NAME = "tb_usuario";
    static public final String USUARIO_ID_SEQUENCE_NAME = "usuario_id_sequence";

    private UsuarioConstantes() {
    }
}
