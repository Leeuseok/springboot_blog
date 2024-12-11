package me.shinsunyoung.springbootdeveloper.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.shinsunyoung.springbootdeveloper.domain.Article;
import me.shinsunyoung.springbootdeveloper.dto.AddArticleRequest;
import me.shinsunyoung.springbootdeveloper.dto.UpdateArticleRequest;
import me.shinsunyoung.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor //final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service
public class BlogService {

    private final BlogRepository blogRepository;

     //★ 블로그 글 추가 메서드. 코드 입력★


    //★ 블로그 글 목록 조회 메서드. 코드 입력★


    //★ 블로그 글 내용 조회 메서드. 코드 입력★


    //★ 블로그 글 삭제 메서드. 코드 입력★


    //★ 블로그 글 수정 메서드. 코드 입력★
    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        //해당 코드 입력!!
    }
}
