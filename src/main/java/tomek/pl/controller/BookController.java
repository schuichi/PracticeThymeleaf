package tomek.pl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import tomek.pl.model.Book;

import java.util.Arrays;
import java.util.List;

import static javafx.scene.input.KeyCode.K;

/**
 * Created by Tomek on 2017-02-01.
 */
@Controller
public class BookController {

    @GetMapping("/loop")
    public String loop(ModelMap modelMap){
        List<Book> books = Arrays.asList(new Book("Author1", "Ksiazka1", 120), new Book("Author2", "Ksiazka2", 99));
        modelMap.addAttribute("books", books );
        return "loop";
    }

}
