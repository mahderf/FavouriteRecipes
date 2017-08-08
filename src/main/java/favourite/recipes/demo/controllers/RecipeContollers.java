package favourite.recipes.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeContollers {

    @GetMapping("/")
    public String  Recipehom(Model model)

    {
        return "home";
    }

    @GetMapping("/crabcake")
    public String  Crabcake()

    {
        return "crabcake";
    }

    @GetMapping("/gingerale")
    public String  Recipeginger()

    {
        return "gingerale";
    }

    @GetMapping("/cornbread")
    public String  Cornbread()

    {
        return "cornbread";
    }

}
