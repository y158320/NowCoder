package com.nowcoder.testmybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TotleController {

    @RequestMapping("777")
    public String say()
    {
        return "单例（Singleton）模式<br>原型（Prototype）模式<br>工厂方法（Factory Method）模式<br>" +
                "抽象工厂（AbstractFactory）模式<br>建造者（Builder）模式<br>代理（Proxy）模式<br>" +
                "适配器（Adapter）模式<br>桥接（Bridge）模式<br>装饰（Decorator）模式<br>外观（Facade）模式<br>" +
                "享元（Flyweight）模式<br>组合（Composite）模式<br>模板方法（TemplateMethod）模式<br>" +
                "策略（Strategy）模式<br>命令（Command）模式<br>职责链（Chain of Responsibility）模式<br>" +
                "状态（State）模式<br>观察者（Observer）模式<br>中介者（Mediator）模式<br>迭代器（Iterator）模式<br>" +
                "访问者（Visitor）模式<br>备忘录（Memento）模式<br>解释器（Interpreter）模式";
    }

}
