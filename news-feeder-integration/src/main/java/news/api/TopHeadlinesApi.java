package news.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import common.exception.ServerException;
import news.model.TopHeadlinesApiRequest;
import news.model.TopHeadlinesApiResponse;

@Path("/top-headlines")
public interface TopHeadlinesApi {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    TopHeadlinesApiResponse getTopHeadlinesNews(@BeanParam TopHeadlinesApiRequest request);
}
