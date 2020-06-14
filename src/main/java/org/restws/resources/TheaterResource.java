package org.restws.resources;

import org.restws.model.Theater;
import org.restws.service.TheaterService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/theaters")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TheaterResource {
    TheaterService theaterService = new TheaterService();

    @GET
    public List<Theater> getTheaters() {
        return theaterService.getAllTheaters();
    }

    @POST
    public Theater addTheater(Theater theater) {
        return theaterService.addTheater(theater);
    }

    @PUT
    @Path("/{theaterId}")
    public Theater updateTheater(@PathParam("theaterId") long id, Theater theater) {
        theater.setId(id);
        return theaterService.updateTheater(theater);
    }
    @DELETE
    @Path("/{theaterId}")
    public void deleteTheater(@PathParam("theaterId") long id) {
        theaterService.removeTheater(id);
    }

    @GET
    @Path("/{theaterId}")
    public Theater getTheater(@PathParam("theaterId") long id) {
        return theaterService.getTheater(id);
    }

    @Path("/{theaterId}/plays")
    public PlayResource getPlayResource() {
        return new PlayResource();
    }

}
