### ssm整合的小demo  
说明：实际上就是通过用户的请求来调用数据库中的数据，然后返回相应的结果。

#### 配置文件：
- web.xml：web的配置文件，指明ApplicationContext.xml和dispatcher-servlet.xml
- ApplicationContext.xml 是spring 全局配置文件，用来控制spring 特性的   -->spring的配置文件
- dispatcher-servlet.xml 是spring mvc里面的，控制器、拦截uri转发view   -->springMVC的配置文件，DispatcherServlet

#### 整体结构
- dao:数据访问层，负责数据的增删改查，使用MyBatis，调用mapper，mapper才是实际对数据库的操作
- service:业务逻辑层：将多个原子性的dao操作进行组合，形成一个完整的业务逻辑
- controller:调用业务逻辑层，返回ModelAndView

#### ssm的优点
- 使用spring可以更加方便的使用mybatis
- spring管理所有组件，包括mybatis中mapper的实现类；
这样业务逻辑层（service）要调用Dao层的时候，只需要使用依赖注入（@Autowired）自动注入mapper
- spring用来管理事务