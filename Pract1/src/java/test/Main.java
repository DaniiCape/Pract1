/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import pract1.Usuario;
import pract1.Contrasenia;
import controlador.ContraseniaPract1Hibernate;
import controlador.UsuarioPract1Hibernate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author
 */
public class Main {

    public static void main(String[] args) {
        //System.out.println("Donde checo");
        UsuarioPract1Hibernate usuariop = new UsuarioPract1Hibernate();
        ContraseniaPract1Hibernate contrap = new ContraseniaPract1Hibernate();
        Contrasenia contra = new Contrasenia();
        contra.setIdcontrasenia(9);
        contra.setContrasenia("hola");
        contrap.save(contra);
        Usuario usuario = new Usuario();
        usuario.setIdusuario(9);
        usuario.setUnombre("Maria");
        usuario.setUapp("Lopez");
        usuario.setUapm("Aguilar");
        usuario.setContrasenia(contra);
        usuariop.save(usuario);
//        usuario.setId(13);
//        usuario.setNombres("Rolando Palermo1");
//        usuario.setApellidos("Rodríguez Cruz1");
//        usuario.setFechaRegistro(new Date());
//        usuarioDAO.save(usuario);
       System.out.println("Todo salio bien en el insert");
//        usuario.setNombres("Caen");
//         usuarioDAO.update(usuario);
//         System.out.println("Todo salio bien en el update");

        List<Usuario> lista = usuariop.findAll();
        for (Usuario user : lista) {
            System.out.println(user.toString());
        }

    }
}
