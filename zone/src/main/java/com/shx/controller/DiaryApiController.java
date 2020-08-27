package com.shx.controller;


import com.shx.pojo.Diary;
import com.shx.pojo.Page;
import com.shx.pojo.Result;
import com.shx.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/diary")
public class DiaryApiController {

    @Autowired
    private DiaryService diaryService;

    @PostMapping("/add")
    public Result<Diary> add(@RequestBody Diary diary){
        diaryService.add(diary);
        return new Result<Diary>(true,"添加日记成功");
    }

    @GetMapping("/selectPage")
    public Result<Page<Diary>> selectPage(int currentPage, int pageSize){
        Page<Diary> page = diaryService.selectPage(currentPage,pageSize);
        if (null != page){
            return new Result<Page<Diary>>(true,"查询成功",page);
        }
        return new Result<Page<Diary>>(false,"查询失败");
    }


}
