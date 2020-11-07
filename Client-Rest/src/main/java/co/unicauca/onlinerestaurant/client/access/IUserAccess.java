package co.unicauca.onlinerestaurant.client.access;

import co.unicauca.common.domain.entity.User;

/**
 * Interface que define los servicios de persistencia de Clientes del
 * restaurante
 *
 * @author Camilo Otaya
 */
public interface IUserAccess {

    /**
     * Buscar un usuario consumiendo un API REST
     *
     * @param id identificado del usuario
     * @return objeto usuario
     * @throws Exception error al buscar un usuario
     */
    public User findUser(String id) throws Exception;

    /**
     * Actualiza un usuario consumiendo un API REST
     *
     * @param id Identificador del usuario
     * @param firstname nombre del usuario
     * @param lastname apellido del usuario
     * @param address dirección del usuario
     * @param mobile telefono del usuario
     * @param email email del usuario
     * @param rol rol del usuario
     * @param pws contraseña del usuario
     * @return objeto usuario
     * @throws Exception error al actualizar el usuario
     */
    public boolean updateUser(String id, String firstname, String lastname, String address, String mobile, String email, String rol, String pws) throws Exception;

    /**
     * Elimina un usuario consumiendo un API REST
     *
     * @param id Identificador del usuario
     * @return true si se elimino correctamente el usuario o false en caso
     * contrario
     * @throws Exception error al actualizar el usuario
     */
    public boolean deleteUser(String id) throws Exception;

    /**
     * Crea un usuario consumiendo un API REST
     *
     * @param user Usuario del restaurante
     * @return Devuelve el id del usuario creado
     * @throws Exception error crear el usuario
     */
    public boolean createUser(User user) throws Exception;

    /**
     * Lista todos los usuarios consumiendo un API REST
     *
     * @return Lista de usuarios
     * @throws java.lang.Exception
     */
    public java.util.List<User> list() throws Exception;

}