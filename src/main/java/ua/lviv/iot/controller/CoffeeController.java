package ua.lviv.iot.controller;

import ua.lviv.iot.model.Coffee;
import ua.lviv.iot.service.CoffeeService;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/coffee")
public class CoffeeController {

    CoffeeService coffeeService = new CoffeeService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Coffee> getCoffees() {
        return coffeeService.getAllCoffee();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Coffee getCoffeeById(@PathParam("id") int id) {
        return coffeeService.getCoffee(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Coffee addCoffee(Coffee coffee) {
        return coffeeService.addCoffee(coffee);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Coffee updateCoffee(Coffee coffee) {
        return coffeeService.updateCoffee(coffee);
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Coffee deleteCoffee(@PathParam("id") int id) {
        return coffeeService.deleteCoffee(id);
    }
}
