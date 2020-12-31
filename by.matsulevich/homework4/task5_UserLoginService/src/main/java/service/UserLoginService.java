package service;

import bean.User;
import sun.rmi.server.UnicastServerRef;

    public class UserLoginService {
    public boolean login (User user, String password){
        if(user.getPassword().equals(password)) {
            setLoginAttemptsToDefault(user);
        return  true;
    }
        reduseNumberOfLoginAttempts(user);
        if(isLoginAttemptEnded(user)) user.setBlocked(true);
        return false;
    }
    private void setLoginAttemptsToDefault(User user){
        if(!user.isBlocked()) {
        user.setNumberOfLoginAttempts(3);
    }
    }
    public void reduseNumberOfLoginAttempts(User user){
        user.setNumberOfLoginAttempts(user.getNumberOfLoginAttempts() -1);
    }
    private boolean isLoginAttemptEnded(User user){
        return user.getNumberOfLoginAttempts() == 0;
    }
    }
