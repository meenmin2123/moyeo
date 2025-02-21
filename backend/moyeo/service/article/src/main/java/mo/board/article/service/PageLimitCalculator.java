package mo.board.article.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PageLimitCalculator {

    // 현재 페이지가 속한 이동 가능한 페이지 범위를 계산.
    public static Long calculatePageLimit(Long page, Long pageSize, Long movablePageCount) {
        // (((page - 1) / movablePageCount) + 1 ) : 이동 범위는 0부터 시작하므로, 1을 더함
        // pageSize * movablePageCount : 한 페이지 크기와 이동 가능한 페이지 수를 곱해 한 번에 로드할 데이터 수 계산.
        return (((page - 1) / movablePageCount) + 1 ) * pageSize * movablePageCount;
    }
}
