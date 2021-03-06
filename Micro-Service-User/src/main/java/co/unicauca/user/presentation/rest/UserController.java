package co.unicauca.user.presentation.rest;

import co.unicauca.common.domain.entity.User;
import co.unicauca.user.domain.service.UserService;
import co.unicauca.common.infra.DomainErrors;
import co.unicauca.common.infra.JsonResponse;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * API REST
 *
 * @author Camilo Otaya
 */
@Stateless
@Path("/users")
public class UserController {

    @Inject
    private UserService service;

    public UserController() {
        service = new UserService();
    }

    /*
        Su uso desde consola mediante client url:
        curl -X GET http://localhost:8085/Micro-Service-User/user-service/users/ 

     */
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<User> findAll() {
        return service.findAll();
    }

    /*
        Su uso desde consola mediante client url:
        curl -X GET http://localhost:8085/Micro-Service-User/user-service/users/1 

     */
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public User findById(@PathParam("id") String id) {
        return service.findById(id);
    }

    /*
        Su uso desde consola mediante client url:
        curl -X GET http://localhost:8085/Micro-Service-User/user-service/users/email/alejo@rc.com 

     */
    @GET
    @Path("/email/{email}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public User findByEmail(@PathParam("email") String email) {
        return service.findByEmail(email);
    }

    /*
        Su uso desde consola mediante client url:
        curl -X POST \
          http://localhost:8085/Micro-Service-User/user-service/users/ \
          -H 'Content-Type: application/json' \
          -d '{
        "address": "calle 10",
        "email": "alejo@rc.com",
        "firstName": "camilo",
        "id": "40",
        "lastName": "rodriguez",
        "mobile": "3166161700",
        "pws": "123",
        "rol": "admin"
    }'
     */
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response create(User user) {
        JsonResponse resp;
        if (service.create(user)) {
            resp = new JsonResponse(true, "Usuario creado con éxito", null);
        } else {
            resp = new JsonResponse(false, "No se pudo crear el usuario", DomainErrors.getErrors());
        }
        return Response.ok().entity(resp).build();
    }

    /*
        Su uso desde consola mediante client url:
        curl -X PUT \
          http://localhost:8085/Micro-Service-User/user-service/users/40 \
          -H 'Content-Type: application/json' \
          -d '{
               "firstName": "Andrés",
               "lastName": "Valverde",
               "address": "Calle 26",
               "mobile": "31232323",
               "email": "sabastianco@unicauca.edu.co",
               "rol": "Admin",
               "pws": "1234"
        }'
     */
    @PUT
    @Path("{email}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response edit(@PathParam("email") String email, User user) {
        JsonResponse resp;
        if (service.update(email, user)) {
            resp = new JsonResponse(true, "Usuario modificado con éxito", null);
        } else {
            resp = new JsonResponse(false, "No se pudo modificar el usuario", DomainErrors.getErrors());
        }
        return Response.ok().entity(resp).build();

    }

    /*
        Su uso desde consola mediante client url:
        curl -X DELETE http://localhost:8085/Micro-Service-User/user-service/users/40

     */
    @DELETE
    @Path("{email}")
    public Response delete(@PathParam("email") String email) {
        JsonResponse resp;
        if (service.delete(email)) {
            resp = new JsonResponse(true, "Usuario eliminado con éxito", null);

        } else {
            resp = new JsonResponse(false, "No se pudo eliminar el usuario", DomainErrors.getErrors());
        }
        service.delete(email);

        return Response.ok().entity(resp).build();

    }
}
