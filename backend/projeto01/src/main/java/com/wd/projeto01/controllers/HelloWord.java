package com.wd.projeto01.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloWord {

  @GetMapping
  public ResponseEntity<List<String>> helloword() {
    // public List<String> helloword() {
    List<String> list = new ArrayList();

    // String nome = "Alex";

    list.addAll(Arrays.asList("Rui", "Robério", "Benedilson", "Jocilé", "Alex"));

    // remover elemento(s) de uma lista se essa lista contver o elemento
    // list.removeIf(a -> a.equals(nome));

    return ResponseEntity.ok(list);
    // return list;
  }

}