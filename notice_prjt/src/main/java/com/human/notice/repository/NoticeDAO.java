package com.human.notice.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.notice.vo.NoticeVO;

@Repository
public class NoticeDAO {
    @Autowired
    private SqlSession sqlSession;

    public List<NoticeVO> selectAll() {
    	List<NoticeVO> noticeList = sqlSession.selectList("NoticeMapper.selectAll");
        System.out.println("Fetched Notices: " + noticeList); // 디버깅용 출력
        return noticeList;
    }

    public void insertNotice(NoticeVO notice) {
        sqlSession.insert("NoticeMapper.insertNotice", notice);
    }
    
    public List<NoticeVO> selectByCategory(String category) {
        return sqlSession.selectList("NoticeMapper.selectByCategory", category);
    }
}
