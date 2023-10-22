package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;


public class ClearState {
    private ArrayList account = new ArrayList<>();

    public ClearState(ClearState copy) {
        account = copy.account;
    }

    public ClearState() {
    }

    public void setUserAccount(ArrayList account) {
        this.account = account;
    }

    public ArrayList getUserAccount() {
        return account;
    }
}

