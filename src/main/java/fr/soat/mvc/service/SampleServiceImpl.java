package fr.soat.mvc.service;

import fr.soat.mvc.exception.InvalidUserException;
import fr.soat.mvc.view.SignupForm;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

/**
 * Created by formation on 25/03/2014.
 */
@Service("sampleService")
public class SampleServiceImpl implements SampleService {

    public SignupForm saveFrom(SignupForm signupForm) throws InvalidUserException{

        String firstName = signupForm.getFirstName();

        if(StringUtils.isEmpty(firstName) || "Dave".equalsIgnoreCase(firstName)) {
            throw new InvalidUserException("Sorry Dave");
        }

        // TODO: Save the form

        return signupForm;
    }
}