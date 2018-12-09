package org.springframework.samples.petclinic.owner;

import org.springframework.samples.petclinic.model.Person;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class FooController {

    @InitBinder("person")
    public void initPetBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(new PersonValidator());
    }

    @RequestMapping("/peopleTest")
    public String people(@Valid Person person, BindingResult result, ModelMap model) {
        /*if (result.hasErrors()) {
            model.put("pet", result.getAllErrors());
            return "success";
        }*/
        List<ObjectError> allErrors = result.getAllErrors();

        System.out.println(123);

        return "success";
    }
}
