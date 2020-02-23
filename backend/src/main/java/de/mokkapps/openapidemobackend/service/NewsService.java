package de.mokkapps.openapidemobackend.service;

import de.mokkapps.gamenews.api.model.Article;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class NewsService {
    public List<Article> getNews() {
        List<Article> articles = new ArrayList<>();
        Article article = new Article();
        article.setDate(LocalDate.now());
        article.setDescription("An article description");
        article.setId(UUID.randomUUID());
        article.setImageUrl("https://images.unsplash.com/photo-1493711662062-fa541adb3fc8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3450&q=80");
        article.setTitle("A title");
        articles.add(article);
        return articles;
    }
}
