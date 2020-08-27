package com.shx.controller;


import com.github.pagehelper.PageInfo;
import com.shx.pojo.Message;
import com.shx.pojo.Page;
import com.shx.pojo.Result;
import com.shx.service.MessageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessageApiController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/add")
    public Result<Message> add(@RequestBody Message message){
        //获取用户名 TODO
        messageService.add(message);
        return new Result<Message>(true,"添加成功！");
    }

    @RequestMapping("/select3")
    public Result<Message> select3(){
        List<Message> messageList = messageService.select3();
        if (null != messageList && messageList.size() > 0){
            return new Result<Message>(true,"查询成功",messageList);
        }
        return new Result<Message>(false,"查询失败");
    }

    @RequestMapping("/selectPage")
    public Result<Message> selectPage( int currentPage, int pageSize){
        Page<Message>  page = messageService.selectPage(currentPage,pageSize);
        if (null != page ){
            return new Result<Message>(true,"查询成功",page);
        }
        return new Result<Message>(false,"查询失败");
    }

}
