package passvalidator.service;

import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-14.
 */
public interface PassValidateService {

    boolean hasUsername(String userId, Map<String, String> userRepo);
    boolean isMember(String userId, String password, Map<String, String > userRepo);
}
