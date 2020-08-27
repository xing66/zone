package com.shx.service;

import com.shx.pojo.Diary;
import com.shx.pojo.Page;

public interface DiaryService {
    void add(Diary diary);

    Page<Diary> selectPage(int currentPage, int pageSize);
}
