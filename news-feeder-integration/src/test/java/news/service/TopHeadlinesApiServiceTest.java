package news.service;

import org.junit.Test;

import news.model.TopHeadlinesApiRequest;
import news.model.TopHeadlinesApiResponse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TopHeadlinesApiServiceTest {

    @Test
    public void getTopHeadlinesFromTopHeadlinesApi() {
        TopHeadlinesApiService topHeadlinesApiService = new TopHeadlinesApiService();
        TopHeadlinesApiResponse response = topHeadlinesApiService.getTopHeadlinesFromTopHeadlinesApi(new TopHeadlinesApiRequest());
        assertNotNull(response);
        assertEquals("ok", response.status);
    }
}