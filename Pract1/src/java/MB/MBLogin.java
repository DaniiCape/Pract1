/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import pract1.Contrasenia;
import pract1.Usuario;
import controlador.UsuarioPract1Hibernate;
import controlador.ContraseniaPract1Hibernate;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
/**
 *
 * @author daniicape
 */
@Named(value = "mBLogin")
@SessionScoped
public class MBLogin implements Serializable {
    String nombre;
    String contrasenia;
    
     /**
     * Creates a new instance of MBLogin
     */
    public MBLogin() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    public int finduser(){
        UsuarioPract1Hibernate usuariop = new UsuarioPract1Hibernate();
        List<Usuario> lista = usuariop.findAll();
        System.out.print("find USER");
        for (Usuario user : lista) {
            if (user.getUnombre().equals(this.getNombre())){
                 System.out.print(this.getNombre());
                 return user.getContrasenia().getIdcontrasenia();
            }
        }
        System.out.print("find usr");
        return -1;
    }
    
    public String findcontra(){
        ContraseniaPract1Hibernate cont = new ContraseniaPract1Hibernate();
        List<Contrasenia> contra = cont.findAll();
        int temp = finduser();
        String contr = "";
        for(Contrasenia c : contra){
            if (c.getIdcontrasenia() == temp){
                contr = c.getContrasenia();
                System.out.print("find contra");
                return contr;
            }
        }
        System.out.print("find contra");
        return "nada";
    }
    public String valida(){
        System.out.print("VALIDA");
        String con = findcontra();
        System.out.print(con);
        System.out.print(this.getContrasenia());
        if (this.getContrasenia().equals(con))
            return "inicio";
        return "error";
    }
    
     public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
