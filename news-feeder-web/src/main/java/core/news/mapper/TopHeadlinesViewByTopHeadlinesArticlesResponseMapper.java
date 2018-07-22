package core.news.mapper;

import news.model.NewsView;
import news.model.TopHeadlinesApiArticlesResponse;

public class TopHeadlinesViewByTopHeadlinesArticlesResponseMapper {

    private TopHeadlinesApiArticlesResponse apiArticlesResponse;

    private TopHeadlinesViewByTopHeadlinesArticlesResponseMapper() {
    }

    public static TopHeadlinesViewByTopHeadlinesArticlesResponseMapper create() {
        return new TopHeadlinesViewByTopHeadlinesArticlesResponseMapper();
    }

    public TopHeadlinesViewByTopHeadlinesArticlesResponseMapper articleResponse(TopHeadlinesApiArticlesResponse articleResponse) {
        this.apiArticlesResponse = articleResponse;
        return this;
    }

    public NewsView map() {
        NewsView newsView = new NewsView();
        newsView.author = apiArticlesResponse.author;
        newsView.description = apiArticlesResponse.description;
        newsView.publishedAt = apiArticlesResponse.publishedAt;
        newsView.title = apiArticlesResponse.title;
        newsView.url = apiArticlesResponse.url;
        newsView.urlToImage = apiArticlesResponse.urlToImage;
        return newsView;
    }
}
