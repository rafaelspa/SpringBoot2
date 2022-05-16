package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // to automate @ResponseBody configuration throughout the controllers
@RequestMapping("anime")
public class AnimeController {

    //localhost:8080/anime/list
//    @RequestMapping(method = RequestMethod.GET, path = "list") deprecated
    @GetMapping(path = "list")
    public List<Anime> list() {
        return List.of(new Anime("DBZ"), new Anime("Berserk"));
    }
}
