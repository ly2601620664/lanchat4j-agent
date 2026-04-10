package com.itheima.consultant.controller;


import com.itheima.consultant.aiservice.ConsultantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChatController {

    @Autowired
    private ConsultantService consultantService;

    @GetMapping(value = "/chat", produces = "text/html;charset=UTF-8")
    public Flux<String> chat(String memoryId,@RequestParam("message") String message) {
        return consultantService.chat(memoryId,message);
    }

//    @RequestMapping("/chat")
//    public String chat(String message){
//        String result = consultantService.chat(message);
//        return result;
//    }

//    @Autowired
//    private OpenAiChatModel model;
//
//    @RequestMapping("/chat")
//    public String chat(String message) { // 消费者传递的消息
//        String result = model.chat(message);
//        return result;
//    }

}
