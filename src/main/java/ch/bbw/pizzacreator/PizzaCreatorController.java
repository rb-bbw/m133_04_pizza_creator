package ch.bbw.pizzacreator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PizzaCreatorController {
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("pizza", new Pizza());
        return "create";
    }
    @PostMapping("/show")
    public String show(Model model, @ModelAttribute Pizza pizza){
        pizza.calculateTotal();
        model.addAttribute("pizza", pizza);
        return "show";
    }
}
