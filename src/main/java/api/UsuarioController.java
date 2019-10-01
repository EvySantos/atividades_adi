package api;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usuario")
public class UsuarioController {

    @GET
    @Path("json")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Usuario> findAll() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        Usuario usuario1 = new Usuario();
        usuario1.setId(1);
        usuario1.setNome("Goku");
        usuario1.setSobrenome("Son");
        
        usuarios.add(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setId(2);
        usuario2.setNome("Gohan");
        usuario2.setSobrenome("Son");

        usuarios.add(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.setId(3);
        usuario3.setNome("Goten");
        usuario3.setSobrenome("Son");

        usuarios.add(usuario3);
        
        return usuarios;   
    }
    
    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<Usuario> list() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        Usuario usuario1 = new Usuario();
        usuario1.setId(1);
        usuario1.setNome("Goku");
        usuario1.setSobrenome("Son");
        
        usuarios.add(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setId(2);
        usuario2.setNome("Gohan");
        usuario2.setSobrenome("Son");

        usuarios.add(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.setId(3);
        usuario3.setNome("Goten");
        usuario3.setSobrenome("Son");

        usuarios.add(usuario3);
        
        return usuarios;
    }
}
