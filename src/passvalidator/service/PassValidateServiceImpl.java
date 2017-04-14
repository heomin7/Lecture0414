package passvalidator.service;

import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-14.
 */

public class PassValidateServiceImpl implements PassValidateService{

    @Override
    public boolean hasUsername(String userId, Map<String, String> map) {
        return map.containsKey(userId);
    }

    @Override
    public boolean isMember(String userId, String password, Map<String, String> map) {

        String pass = map.get(userId);

        if(pass == null || !pass.equals(password)){
            return false;
        }
        else{
            return true;
        }

    }
}
