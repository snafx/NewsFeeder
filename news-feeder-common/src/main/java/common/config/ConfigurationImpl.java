package common.config;

public class ConfigurationImpl implements Configuration {

    @Override
    public String getTopHeadlinesApiUrl() {
        return "https://newsapi.org/v2";
    }
}
