package com.shx.service;

import com.shx.pojo.Message;
import com.shx.pojo.Page;

import java.util.List;

public interface MessageService {
    void add(Message message);

    List<Message> select3();

    Page<Message> selectPage(int currentPage, int pageSize);
}
