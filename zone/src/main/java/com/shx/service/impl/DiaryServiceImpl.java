package com.shx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shx.mapper.DiaryDao;
import com.shx.pojo.Diary;
import com.shx.pojo.Page;
import com.shx.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DiaryServiceImpl implements DiaryService {

    @Autowired
    private DiaryDao diaryDao;


    public void add(Diary diary) {
        diary.setCreateTime(new Date());
        diaryDao.insert(diary);
    }

    public Page<Diary> selectPage(int currentPage, int pageSize) {
        String order = "create_time"+" desc";
        PageHelper.startPage(currentPage,pageSize,order);
        PageInfo<Diary> pageInfo = new PageInfo<Diary>(diaryDao.selectAll());
        Page<Diary> page = new Page<Diary>(pageInfo.getPages(),pageInfo.getTotal(),currentPage,pageInfo.getList());
        return page;
    }
}
