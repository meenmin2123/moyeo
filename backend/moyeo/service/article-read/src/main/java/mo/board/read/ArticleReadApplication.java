package mo.board.read;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "mo.board")
@SpringBootApplication
@EnableJpaRepositories(basePackages = "mo.board")
public class ArticleReadApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArticleReadApplication.class, args);
    }
}
