package com.human.notice.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NoticeVO {
    private int n_idx; // nIdx를 소문자로 변경
    private String n_category; // nCategory를 소문자로 변경
    private String n_title;    // nTitle을 소문자로 변경
    private String n_content;  // nContent를 소문자로 변경
    private String n_regdate;  // nRegdate를 소문자로 변경
    private String n_update;   // nUpdate를 소문자로 변경
    private String n_status;   // nStatus를 소문자로 변경
}
