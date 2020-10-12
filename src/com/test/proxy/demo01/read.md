这是一个静态代理的例子，主要参考 狂神说的博客 ：https://www.cnblogs.com/renxuw/p/12994080.html

一个房东Host 类， 一个接口 Rent ,一个代理类ProxyHost.

Host类 实现 Rent 接口
ProxyHost 实现 Rent 接口 

现在房东 Host 类 ， 专注做租房这件事，其他的事情不想管（就是变懒了） ，
于是房东 Host 类 ， 就想找别人来帮他处理其他事情，房东Host只是想安静的躺在，等最后的出租画押。

这时出现了一个代理类ProxyHost(中介)。

 那有一个问题了。
 
 房东和中介之间 如何建立联系呢？  Host 与  ProxyHost
 
ProxyHost类中 通过 
             // 声明一个房东对象，没有初始化，null
             private Host host;
         
             // 定义一个有参构造方法
             public ProxyHost(Host host) {
                 this.host = host;
             }
 与 Host 建立联系。
 
思考： 代理类ProxyHost类中 是否需要实现接口。采用ProxyHostT 也是可以的。

租房的人 ： TestProxy 类

    