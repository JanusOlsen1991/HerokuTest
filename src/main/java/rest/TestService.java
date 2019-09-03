package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Path("test")
public class TestService {

    @GET
    public String getTest(){
        return "Hello World";
    }

    @Path("json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getHelloJson(){
        return new String("Hej med dig");
    }

    @Path("mysql")
    @GET
    public String getSQL() throws SQLException {

        return "Hej 2";

    }


}
