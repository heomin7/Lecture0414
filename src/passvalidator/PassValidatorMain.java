package passvalidator;

import passvalidator.service.PassValidateService;
import passvalidator.service.PassValidateServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-14.
 */
public class PassValidatorMain {
    public static void main(String[] args){
        //1. prepare data
        //ID와 패스워드를 보관하고 있는 데이터를 로딩
        //5개 정도의 샘플데이터를 생성
        Map<String, String> userRepo = new HashMap<>();
        userRepo.put("soongon", "12345678");
        userRepo.put("kildong", "34345678");
        userRepo.put("chanho", "12121212");
        userRepo.put("yeona", "78787878");
        userRepo.put("jaeseok", "00000000");

        Scanner in = new Scanner(System.in);
        System.out.print("아이디를 입력하세요: >");
        String userId = in.nextLine().trim();
        System.out.print("패스워드를 입력하세요: >");
        String password = in.nextLine().trim();

        PassValidateService service = new PassValidateServiceImpl();

        if(!service.hasUsername(userId, userRepo)){
            System.out.println("사용자 아닙니다. 가입하시거나 아이디를 확인해주세요.");
        }
        else if(!service.isMember(userId, password, userRepo)){
            System.out.println("패스워드가 잘못되었습니다.");
        }
        else{
            System.out.printf("%s님 어서오세요", userId);
        }

    }
}
