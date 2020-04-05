package spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        Object o=classPathXmlApplicationContext.getBean("testPojo");
        System.out.println(o.toString());
    }


}
