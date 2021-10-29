/**
 * Project name(项目名称)：注解
 * Package(包名): PACKAGE_NAME
 * Class(类名): test_Override
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/29
 * Time(创建时间)： 18:49
 * Version(版本): 1.0
 * Description(描述)：
 * /@Override 注解是用来指定方法重写的，只能修饰方法并且只能用于方法重写，不能修饰其它的元素。
 * 它可以强制一个子类必须重写父类方法或者实现接口的方法。
 */

public class test_Override
{
    private String name;
    private int age;
    private String sex;

    public test_Override(String name, int age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("age：").append(age).append('\n');
        stringbuilder.append("sex：").append(sex);
        return stringbuilder.toString();
    }
}
