
demo01:
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
      想了一下，代理类实现的接口（Rent） 里面可能包含了很多方法，
      代理类实现接口（Rent）,是实现接口全部方法，这里用代理类的成员方法也是可以实现的。
        
      代理类实现接口方法和写成员方法 两者比较，差不多（暂时没有发现那个更好）  
     
      
      
租房的人 ： TestProxy 类 要租房，这里没有房东（被代理类理解为不可见），只能找到代理类ProxyHost 来 租房 rent();

来看 TestProxy main 方法，从下往上看。

代理类 给 租房的人（实际需要调用被代理类的对象） 租房 ：  proxyHost.rent() 
        ——> 获取到代理类对象proxyHost,ProxyHost proxyHost = new ProxyHost(host),
        ——> 需要一个被代理类的对象，让代理类进行初始什么呢，初始化这个 private Host host; 使代理类和被代理类真正建立关系。
        
静态代理类的缺点：类多了 , 多了代理类 , 工作量变大了 . 开发效率降低 .
    
demo02：如是叫 类多了 , 多了代理类 , 工作量变大了 . 开发效率降低  ？



