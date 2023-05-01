package com.saturn.merkezi.controller;





import com.saturn.merkezi.entity.Reader;
import com.saturn.merkezi.services.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @GetMapping("/")
    public String showReaders(Model model) {
        List<Reader> readers = readerService.getAllReaders();
        model.addAttribute("readers", readers);
        return "outdex";
    }

    @GetMapping("/admin")
    public String showAllReaders(Model model) {
        List<Reader> readers = readerService.getAllReaders();
        model.addAttribute("readers", readers);
        return "admin";
    }
    @GetMapping("/home")
    public String home(Model model) {
        List<Reader> readers = readerService.getAllReaders();
        model.addAttribute("readers", readers);
        return "index";
    }


    @PostMapping("/save")
    public String saveReader(@RequestParam("name") String name,
                             @RequestParam("age") int age,
                             @RequestParam("citizen") String citizen,
                             @RequestParam("phoneNumber") String phoneNumber,
                             @RequestParam("noteArea") String noteArea) {

        Reader reader = new Reader(name, age, citizen, phoneNumber, noteArea );


        LocalDateTime now = LocalDateTime.now();

        // Set the creation time of an object to the current date and time
        reader.setCreationTime(now);


        readerService.saveReader(reader);
        return "successfully";
    }
}

