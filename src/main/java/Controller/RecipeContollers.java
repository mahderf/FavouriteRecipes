package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeContollers {

    @GetMapping("/")
    public String  Recipehom(Model model)

    {
        String  msg= "Wellcome to Crabby Page";
        model.addAttribute("message", msg);
        return "home";
    }

    @GetMapping("/crabcake")
    public String  crabcake(Model model)

    {
        String  msg= "Wellcome to Crabby Page";
        model.addAttribute("message", msg);
        return "crabcake";
    }

    @GetMapping("/gingerale")
    public String  recipeginger(Model model)

    {
        String  msg= "Wellcome to Crabby Page";
        model.addAttribute("message", msg);
        return "gingerale";
    }

    @GetMapping("/cornbread")
    public String  cornbread(Model model)

    {
        String  msg= "Wellcome to Crabby Page";
        model.addAttribute("message", msg);
        return "cornbread";
    }

}
