package com.human.notice.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NoticeVO {
    private int nidx; // nIdx를 소문자로 변경
    private String ncategory; // nCategory를 소문자로 변경
    private String ntitle;    // nTitle을 소문자로 변경
    private String ncontent;  // nContent를 소문자로 변경
    private String nregdate;  // nRegdate를 소문자로 변경
    private String nupdate;   // nUpdate를 소문자로 변경
    private String nstatus;   // nStatus를 소문자로 변경
}
