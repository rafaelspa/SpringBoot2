package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan; //
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; //
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController // to automate @ResponseBody configuration throughout the controllers
@RequestMapping("anime")
@Log4j2
//@AllArgsConstructor //lombok create a constructor with all attributes
@RequiredArgsConstructor // lombok create a constructor with all final attributes
public class AnimeController {
//    private DateUtil dateUtil = new DateUtil(); Not a good practice: DateUtil atm don't have any attribute to be initialized with the constructor, but inside it, you have to initialize other types of objects
//    @Autowired // better to test and it is more secure
    private final DateUtil dateUtil;

//    public AnimeController(DateUtil dateUtil) { // dependency injection by fields are not recommended, it's recommended to use constructors
//        this.dateUtil = dateUtil;
//    }

    //localhost:8080/anime/list
//    @RequestMapping(method = RequestMethod.GET, path = "list") deprecated
    @GetMapping(path = "list")
    public List<Anime> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime("Berserk"));
    }
}
