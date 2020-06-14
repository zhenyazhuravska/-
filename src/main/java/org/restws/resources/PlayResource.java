package org.restws.resources;


import org.restws.bean.FilterBean;
import org.restws.model.Play;
import org.restws.service.PlayService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.core.Response;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class PlayResource {
    private PlayService playService = new PlayService();


    @GET
    public List<Play> getAllPlays(@PathParam("theaterId") long libraryId) {
        return playService.getAllPlays(libraryId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{playId}/bean")
    public Response getBean(@BeanParam FilterBean filterBean) {
        return Response.ok().entity(filterBean).type(MediaType.APPLICATION_JSON).build();
    }

    @POST
    public Play addPlay(@PathParam("theaterId") long theaterId, Play play) {
        return playService.addPlay(theaterId, play);
    }

    @PUT
    @Path("/{playId}")
    public Play updatePlay(@PathParam("theaterId") long theaterId, @PathParam("playId") long id, Play play) {
        play.setId(id);
        return playService.updatePlay(theaterId, play);
    }

    @DELETE
    @Path("/{playId}")
    public void deletePlay(@PathParam("theaterId") long theaterId, @PathParam("playId") long playId) {
       playService.removePlay(theaterId, playId);
    }

    @GET
    @Path("/{playId}")
    public Play getTheater(@PathParam("theaterId") long theaterId, @PathParam("playId") long playId) {
        return playService.getPlay(theaterId, playId);
    }
}
