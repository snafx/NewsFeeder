package core.news.mapper;

import java.util.List;
import java.util.stream.Collectors;

import news.model.TopHeadlinesApiResponse;
import news.model.NewsView;

public class TopHeadlinesResponseToViewMapper {

    public List<NewsView> mapToView(TopHeadlinesApiResponse newsResponse) {
        return newsResponse.articles.stream()
                                    .map(article -> TopHeadlinesViewByTopHeadlinesArticlesResponseMapper.create().articleResponse(article).map())
                                    .collect(Collectors.toList());
    }
}
