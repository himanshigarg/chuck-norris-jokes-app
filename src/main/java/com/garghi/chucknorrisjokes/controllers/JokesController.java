package com.garghi.chucknorrisjokes.controllers;

import com.garghi.chucknorrisjokes.services.JokeService;
import com.garghi.chucknorrisjokes.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeServiceImpl jokesService) {
        this.jokeService = jokesService;
    }

    @RequestMapping("/jokes")
    public String getJokes(Model model) {
        model.addAttribute("jokes", jokeService.getChuckNorrisJoke());
        return "jokes/index";
    }
}
