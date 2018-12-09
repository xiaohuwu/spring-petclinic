package org.springframework.samples.petclinic.owner;

import org.springframework.samples.petclinic.model.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        Person p = (Person) obj;
        if (p.getFirstName() == null) {
            e.rejectValue("firstName", null, "不呢怀");
        }
    }
}
