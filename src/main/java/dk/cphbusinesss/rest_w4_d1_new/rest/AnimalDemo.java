package dk.cphbusinesss.rest_w4_d1_new.rest;


import com.google.gson.Gson;
import dk.cphbusinesss.rest_w4_d1_new.model.AnimalNoDB;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("animal")
public class AnimalDemo {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Vuf...(Message from a dog)";
    }
    @GET
    @Path("animal_list")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllAnimals(){
        return "[\"Dog\", \"Cat\", \"Mouse\", \"Bird\"]";
    }
    @GET
    @Path("animalObject")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAnimalObject(){
        return new Gson().toJson(new AnimalNoDB("Duck", "Quack"));
    }
}