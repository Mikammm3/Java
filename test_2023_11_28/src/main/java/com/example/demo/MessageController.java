package com.example.demo;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    private List<MessageInfo> messageInfoList = new ArrayList<>();

    @RequestMapping("/publish")
    public boolean publish(MessageInfo messageInfo) {
        if (!StringUtils.hasLength(messageInfo.getFrom())
                || !StringUtils.hasLength(messageInfo.getTo())
                || !StringUtils.hasLength(messageInfo.getMessage())) {
            return false;
        }
        // 暂时存放在内存中
        messageInfoList.add(messageInfo);
        return true;
    }

    @RequestMapping("/getList")
    public List<MessageInfo> getList() {
        return messageInfoList;
    }
}
