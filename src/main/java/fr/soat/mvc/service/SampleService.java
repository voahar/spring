package fr.soat.mvc.service;

import fr.soat.mvc.exception.InvalidUserException;
import fr.soat.mvc.view.SignupForm;

/**
 * Created by formation on 25/03/2014.
 */
public interface SampleService {

    public SignupForm saveFrom(SignupForm signupForm) throws InvalidUserException;

}
