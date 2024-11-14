package ex02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 1차 개발자가 작성하는 코드
 */

public class Router {

    UserController uc;

    public Router(UserController uc) {
        this.uc = uc;
    }

    public void routing(String path){
        // 1. 메서드 찾아내기
        Method[] methods = uc.getClass().getMethods();

        // 2. 어노테이션 체크하기
        for(Method m : methods){
            RequestMapping rm = m.getAnnotation(RequestMapping.class);

            // 3. value와 path 일치 확인해서 일치하면 invoke 하기
            if(rm == null) break;

            if(rm.value().equals(path)){
                try {
                    m.invoke(uc);
                }catch (Exception e){
                    throw new RuntimeException("메서드 실행중 오류가 발생했어요");
                }
            }
        }
        

    }
}
