package ex02;

/**
 * 2차 개발자가 작성하는 코드
 */

public class UserController extends Object{

    @RequestMapping("/login")
    public void login(){
        System.out.println("로그인");
    }

    @RequestMapping("/join")
    public void join(){
        System.out.println("회원가입");
    }

    @RequestMapping("/logout")
    public void logout(){
        System.out.println("로그아웃");
    }

    @RequestMapping("/userinfo")
    public void userinfo(){
        System.out.println("유저정보");
    }
}
