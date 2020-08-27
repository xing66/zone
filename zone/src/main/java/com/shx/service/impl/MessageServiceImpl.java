package com.shx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shx.mapper.MessageDao;
import com.shx.pojo.Message;
import com.shx.pojo.Page;
import com.shx.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    public void add(Message message) {
        message.setCreateTime(new Date());
        messageDao.insert(message);
    }

    public List<Message> select3() {
        List<Message> messageList = messageDao.select3();
        return messageList;
    }

    public Page<Message> selectPage(int currentPage, int pageSize) {
        String orderBy = "create_time" + " desc";
        PageHelper.startPage(currentPage, pageSize,orderBy);
        PageInfo<Message> pageInfo = new PageInfo<Message>(messageDao.selectAll());
        Page<Message> page = new Page<Message>(pageInfo.getPages(),pageInfo.getTotal(),currentPage,pageInfo.getList());
        return page;
    }

}
