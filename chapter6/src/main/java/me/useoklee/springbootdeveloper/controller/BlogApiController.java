package me.shinsunyoung.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.springbootdeveloper.domain.Article;
import me.shinsunyoung.springbootdeveloper.dto.AddArticleRequest;
import me.shinsunyoung.springbootdeveloper.dto.ArticleResponse;
import me.shinsunyoung.springbootdeveloper.dto.UpdateArticleRequest;
import me.shinsunyoung.springbootdeveloper.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController //HTTP Response Body에 JSON 형식으로 데이터를 반환하는 컨트롤러
public class BlogApiController {

    private final BlogService blogService;

    //★ 글 작성 메서드 ★
    @PostMapping("/api/articles")
    //@RequestBody 로 요청한 본문 값 매핑
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
       //코드 입력

       //요청한 자원이 성공적으로 생성되면 저장된 블로그글 정보를 응답 객체에 담아 전송. 코드 입력

    }

    //★ 글 목록 조회 메서드 ★
    @GetMapping("/api/articles")
    public ResponseEntity<List<ArticleResponse>> findAllArticles() {
        List<ArticleResponse> articles = blogService.findAll()
                .stream()
                .map(ArticleResponse::new)
                .toList();
         //해당 코드 입력!!
    }

    //★ 글 내용 조회 메서드 ★
    @GetMapping("/api/articles/{id}")
    public ResponseEntity<ArticleResponse> findArticle(@PathVariable long id) {
       // 해당 코드 입력!!

    }


    //★ 글 삭제 메서드 ★
    @DeleteMapping("/api/articles/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable long id) {
        //해당 코드 입력!!

    }

    //★ 글 수정 메서드 ★
    @PutMapping("/api/articles/{id}")
    public ResponseEntity<Article> updateArticle(@PathVariable long id,
                                                 @RequestBody UpdateArticleRequest request) {
       //해당 코드 입력!!
    }

}
