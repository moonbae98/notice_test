package com.human.notice.service;

import java.util.List;

import com.human.notice.vo.NoticeVO;

public interface NoticeService {
    List<NoticeVO> getAllNotices();
    List<NoticeVO> getNoticesByCategory(String category);
    void addNotice(NoticeVO notice);
}