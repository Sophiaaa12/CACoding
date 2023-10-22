package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;
import use_case.login.LoginOutputData;


public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = clearOutputBoundary;
    }
    @Override
    public void execute() {
        ArrayList account = userDataAccessObject.getaccount();
        this.userDataAccessObject.cancel();
        ClearOutputData clearOutputData = new ClearOutputData(account);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
