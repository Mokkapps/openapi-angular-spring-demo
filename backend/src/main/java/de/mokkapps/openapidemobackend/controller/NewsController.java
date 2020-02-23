package de.mokkapps.openapidemobackend.controller;

import de.mokkapps.gamenews.api.NewsApi;
import de.mokkapps.gamenews.api.model.Article;
import de.mokkapps.openapidemobackend.service.NewsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
@Controller
public class NewsController implements NewsApi {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @Override
    @GetMapping("/news")
    @CrossOrigin(origins = "http://localhost:4200")
    @ApiOperation("Returns list of latest news")
    public ResponseEntity<List<Article>> getNews() {
        return new ResponseEntity<>(this.newsService.getNews(), HttpStatus.OK);
    }
}
