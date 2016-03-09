package controlador;

import pract1.Contrasenia;
import java.util.List;

/**
 *
 * @author daniicape
 */
public class ContraseniaPract1Hibernate extends AbstractDao{
    
    public ContraseniaPract1Hibernate(){
        super();
    }
    
    /**
     * Insert a new Contraseña into the database.
     *
     * @param contraseña
     */
    public void save(Contrasenia contra) throws DataAccessLayerException {
        super.save(contra);
    }

    /**
     * Updates a new Contraseña into the database.
     *
     * @param contraseña
     */
    public void update(Contrasenia contra) throws DataAccessLayerException {
        super.update(contra);
    }

    /**
     * Delete a detached Contraseña from the database.
     *
     * @param contraseña
     */
    public void delete(Contrasenia contra) throws DataAccessLayerException {
        super.delete(contra);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public Contrasenia find(Long id) throws DataAccessLayerException {
        return (Contrasenia) super.find(Contrasenia.class, id);
    }

    /**
     * Lista todos los usuarios de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Contrasenia.class);
    }
}

