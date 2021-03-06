package com.example.demo.service;

import com.example.demo.model.Message;
import com.example.demo.repository.messageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements messageService{

  @Autowired
  messageRepository mesRepo;

  @Override
  public List<Message> findAll() {
    return mesRepo.findAll();
  }
}
