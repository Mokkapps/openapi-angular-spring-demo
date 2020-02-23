import { Component } from '@angular/core';
import { NewsService } from 'build/openapi/api/news.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';
  $articles = this.newsService.getNews();

  constructor(private readonly newsService: NewsService) {
  }

}
