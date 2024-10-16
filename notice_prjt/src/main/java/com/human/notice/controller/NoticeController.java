package com.human.notice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.human.notice.service.NoticeService;
import com.human.notice.vo.NoticeVO;

@Controller
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @GetMapping("/list")
    public String list(@RequestParam(value = "category", required = false, defaultValue = "전체") String category, Model model) {
        List<NoticeVO> noticeList;
        if ("전체".equals(category)) {
            noticeList = noticeService.getAllNotices();
        } else {
            noticeList = noticeService.getNoticesByCategory(category);
        }
        model.addAttribute("noticeList", noticeList);
        model.addAttribute("selectedCategory", category);
        return "notice/notice_list";
    }

    @GetMapping("/write")
    public String writeForm() {
        return "notice/notice_write";
    }

    @PostMapping("/write")
    public String write(NoticeVO notice) {
        noticeService.addNotice(notice);
        return "redirect:/notice/list";
    }
}
