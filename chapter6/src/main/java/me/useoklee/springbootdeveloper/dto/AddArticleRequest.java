package me.shinsunyoung.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.shinsunyoung.springbootdeveloper.domain.Article;

@NoArgsConstructor  //기본 생성자
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자
@Getter

public class AddArticleRequest {
    /* title과 content 코드 입력하세요 */

    /*생성자를 사용해 객체 생성. builder 패턴으로 DTO를 엔티티로 만들어줌. 블로그 글 추가시 사용 */

}
