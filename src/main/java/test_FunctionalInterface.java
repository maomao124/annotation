/**
 * Project name(项目名称)：注解
 * Package(包名): PACKAGE_NAME
 * Class(类名): test_FunctionalInterface
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/29
 * Time(创建时间)： 19:36
 * Version(版本): 1.0
 * Description(描述)： 在学习 Lambda 表达式时，我们提到如果接口中只有一个抽象方法（可以包含多个默认方法或多个 static 方法），
 * 那么该接口就是函数式接口。@FunctionalInterface 就是用来指定某个接口必须是函数式接口，所以 @FunInterface 只能修饰接口，不能修饰其它程序元素。
 *
 * @FunctionalInterface 注解的作用只是告诉编译器检查这个接口，保证该接口只能包含一个抽象方法，否则就会编译出错。
 */

@FunctionalInterface
interface FunInterface
{
     default void print()
    {
        System.out.println("hello");
    }

    default void show()
    {
        System.out.println("hello world");
    }

    void test1(); // 只定义一个抽象方法
    //void test2(); //报错
}

public class test_FunctionalInterface implements FunInterface
{

    @Override
    public void test1()
    {
        print();
        show();
    }
}
