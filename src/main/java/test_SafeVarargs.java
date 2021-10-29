/**
 * Project name(项目名称)：注解
 * Package(包名): PACKAGE_NAME
 * Class(类名): test_SafeVarargs
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/29
 * Time(创建时间)： 19:27
 * Version(版本): 1.0
 * Description(描述)： @SafeVarargs注解不适用于非 static 或非 final 声明的方法，对于未声明为 static 或 final 的方法，
 * 如果要抑制 unchecked 警告，可以使用 @SuppressWarnings 注解。
 */

public class test_SafeVarargs
{
    @SafeVarargs
    public static <T> void display(T... array)  //来自形参化 vararg 类型的可能的堆污染
    {
        for (T arg : array)
        {
            System.out.println(arg.getClass().getName() + ":" + arg);
        }
    }

    public static void main(String... args)
    {
        // 传递可变参数，参数是泛型集合
        display(1579, 458, 45);
        // 传递可变参数，参数是非泛型集合
        display("10", 45, 49,65,58.25); // 会有编译警告
    }
}
