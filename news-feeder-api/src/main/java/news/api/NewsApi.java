package news.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import common.exception.ServerException;
import common.rest.Response;
import news.model.NewsView;

@Path("/news")
public interface NewsApi {

    @GET
    @Path("/top")
    @Produces(MediaType.APPLICATION_JSON)
    Response<NewsView> getTopNews() throws ServerException;
}
