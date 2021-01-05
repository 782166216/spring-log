# spring-log

execution(<修饰符模式>? <返回类型模式> <方法名模式>(<参数模式>) <异常模式>?)
除了返回类型模式、方法名模式和参数模式外，其它项都是可选的。
("execution(public * com.zxc.springlog.controller..*.*(..))")

1、execution(): 表达式主体。

2、第一个*号：表示返回类型， *号表示所有的类型。

3、包名：表示需要拦截的包名，后面的两个句点表示当前包和当前包的所有子包，com.zxc.springlog.controller包、子孙包下所有类的方法。

4、第二个*号：表示类名，*号表示所有的类。

5、*(..):最后这个星号表示方法名，*号表示所有的方法，后面括弧里面表示方法的参数，两个句点表示任何参数

("execution( * com.zxc.springlog.controller..*.get*(..))")

1、execution()表达式主体

2、第一个*号：表示返回类型， *号表示所有的类型。

3、包名：表示需要拦截的包名，后面的两个句点表示当前包和当前包的所有子包，com.zxc.springlog.controller包、子孙包下所有类的方法。

4、第二个*号：表示类名，*号表示所有的类。

5、get*(..):最后这个星号表示方法名，get*号表示所有以get开头的方法，后面括弧里面表示方法的参数，两个句点表示任何参数
