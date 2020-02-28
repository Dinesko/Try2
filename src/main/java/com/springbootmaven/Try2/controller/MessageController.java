package com.springbootmaven.Try2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping("message")
public class MessageController {

//    private User user = new User(2, "Denis", "Danilyuk");
//
//    private  User[] users = {
//        new User(2, "Denis", "Danilyuk"),
//        new User(3, "Donis", "Danilyuk")
//    };
//
//    @Autowired
//    ProjectsRepository projectsRepository;
//
//    private Project project = new Project(2, "Deadline", "123", 2, users);
//
//    @GetMapping
//    public Project list() {
//        return project;
//    }
//
//    private List<Map<String, String>> messages = new ArrayList<Map<String, String>>() {{
//        add(new HashMap<String, String>() {{ put("id", "1"); put("text", "First message"); }});
//        add(new HashMap<String, String>() {{ put("id", "2"); put("text", "Second message"); }});
//        add(new HashMap<String, String>() {{ put("id", "3"); put("text", "Third message"); }});
//    }};
    @Autowired
    ProjectsRepository projectsRepository;
//    private ProjectMockedData projectMockedData = ProjectMockedData.getInstance();

    @GetMapping("/project")
    public List<Project> index(){
        return projectsRepository.findAll();
    }


//    @GetMapping
//    public List<Map<String, String>> list() {
//        return messages;
//    }


//    @GetMapping("{id}")
//    public Map<String, String> getOne(@PathVariable String id) {
//        return getMessage(id);
//    }
//
//    private Map<String, String> getMessage(@PathVariable String id) {
//        return messages.stream()
//                .filter(message -> message.get("id").equals(id))
//                .findFirst()
//                .orElseThrow(NotFoundException::new);
//    }
}
