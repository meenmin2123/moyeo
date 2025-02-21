package mo.board.hotArticle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "mo.board")
@SpringBootApplication
@EnableJpaRepositories(basePackages = "mo.board")
public class HotArticleApplication {
    public static void main(String[] args) {
        SpringApplication.run(HotArticleApplication.class, args);
    }
}
