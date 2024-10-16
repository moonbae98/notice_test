package com.human.notice.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SearchVO {
    private String category;
    private String searchType;
    private String keyword;
}
