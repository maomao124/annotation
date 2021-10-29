/**
 * Project name(项目名称)：注解
 * Package(包名): PACKAGE_NAME
 * Class(类名): test_Deprecated
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/29
 * Time(创建时间)： 18:56
 * Version(版本): 1.0
 * Description(描述)： @Deprecated 可以用来注解类、接口、成员方法和成员变量等，用于表示某个元素（类、方法等）已过时。
 * 当其他程序使用已过时的元素时，编译器将会给出警告。
 * Java 9 为 @Deprecated 注解增加了以下两个属性：
 * forRemoval：该 boolean 类型的属性指定该 API 在将来是否会被删除。
 * since：该 String 类型的属性指定该 API 从哪个版本被标记为过时。
 */

@Deprecated
public class test_Deprecated
{
    @Deprecated
    private String name;
    private int age;
    private String sex;

    public test_Deprecated(String name, int age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public test_Deprecated()
    {

    }

    public String getName()
    {
        return name;
    }

    @Deprecated
    public int getAge()
    {
        return age;
    }

    @Deprecated
    public String getSex()
    {
        return sex;
    }

    public void setAge(int age)
    {
        if (age >= 0)
        {
            this.age = age;
        }
        else
        {
            this.age = 0;
        }
    }

    @Deprecated
    public void setName(String name)
    {
        this.name = name;
    }

    // since属性指定从哪个版本开始被标记成过时，forRemoval指定该API将来会被删除
    @Deprecated(since = "10", forRemoval = true)
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    @Override
    @Deprecated
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("age：").append(age).append('\n');
        stringbuilder.append("sex：").append(sex).append('\n');
        return stringbuilder.toString();
    }
}
