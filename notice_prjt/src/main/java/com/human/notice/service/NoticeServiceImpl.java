package com.human.notice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.human.notice.repository.NoticeDAO;
import com.human.notice.vo.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeDAO noticeDAO;

    @Override
    public List<NoticeVO> getAllNotices() {
        return noticeDAO.selectAll();
    }

    @Override
    public List<NoticeVO> getNoticesByCategory(String category) {
        return noticeDAO.selectByCategory(category);
    }

    @Override
    public void addNotice(NoticeVO notice) {
        noticeDAO.insertNotice(notice);
    }
}
