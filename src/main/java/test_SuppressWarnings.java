import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Random;

/**
 * Project name(项目名称)：注解
 * Package(包名): PACKAGE_NAME
 * Class(类名): test_SuppressWarnings
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/29
 * Time(创建时间)： 19:08
 * Version(版本): 1.0
 * Description(描述)： 抑制编译器警告
 * Java 中的 @SuppressWarnings 注解指示被该注解修饰的程序元素（以及该程序元素中的所有子元素）取消显示指定的编译器警告，
 * 且会一直作用于该程序元素的所有子元素。例如，使用 @SuppressWarnings 修饰某个类取消显示某个编译器警告，
 * 同时又修饰该类里的某个方法取消显示另一个编译器警告，那么该方法将会同时取消显示这两个编译器警告。
 * 通常情况下，如果程序中使用没有泛型限制的集合将会引起编译器警告，为了避免这种编译器警告，可以使用 @SuppressWarnings 注解消除这些警告。
 * 注解的使用有以下三种：
 * 抑制单类型的警告：@SuppressWarnings("unchecked")
 * 抑制多类型的警告：@SuppressWarnings("unchecked","rawtypes")
 * 抑制所有类型的警告：@SuppressWarnings("unchecked")
 * 关键字	用途
 * all	抑制所有警告
 * boxing	抑制装箱、拆箱操作时候的警告
 * cast	抑制映射相关的警告
 * dep-ann	抑制启用注释的警告
 * deprecation	抑制过期方法警告
 * fallthrough	抑制在 switch 中缺失 breaks 的警告
 * finally	抑制 finally 模块没有返回的警告
 * hiding	抑制相对于隐藏变量的局部变量的警告
 * incomplete-switch	忽略不完整的 switch 语句
 * nls	忽略非 nls 格式的字符
 * null	忽略对 null 的操作
 * rawtypes	使用 generics 时忽略没有指定相应的类型
 * restriction	抑制禁止使用劝阻或禁止引用的警告
 * serial	忽略在 serializable 类中没有声明 serialVersionUID 变量
 * static-access	抑制不正确的静态访问方式警告
 * synthetic-access	抑制子类没有按最优方法访问内部类的警告
 * unchecked	抑制没有进行类型检查操作的警告
 * unqualified-field-access	抑制没有权限访问的域的警告
 * unused	抑制没被使用过的代码的警告
 */


public class test_SuppressWarnings
{
    @SuppressWarnings("all")
    LinkedList p = new LinkedList();
    @SuppressWarnings("all")
    LinkedList p1 = new LinkedList();

    public static int getIntRandom(int min, int max)         //空间复杂度和时间复杂度更低
    {
        if (min > max)
        {
            min = max;
        }
        return min + (int) (Math.random() * (max - min + 1));
    }

    public static int getIntRandom1(int min, int max)          //获取int型的随机数
    {
        if (min > max)
        {
            min = max;
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static double getDoubleRandom(double min, double max)  //double型随机数
    {
        if (min > max)
        {
            min = max;
        }
        return min + (Math.random() * (max - min));
    }

    public static double getDoubleRandom(double min, double max, String format)
    {            //空间复杂度和时间复杂度都特别高，只适合获取非常少的格式化的随机数使用。farmat：##.##或00.00
        DecimalFormat decimalFormat = new DecimalFormat(format);
        if (min > max)
        {
            min = max;
        }
        return Double.parseDouble(decimalFormat.format(min + (Math.random() * (max - min))));
    }

    @SuppressWarnings("all")
    public test_SuppressWarnings()
    {
        for (int i = 0; i < 10; i++)
        {

            p.add(getIntRandom(50, 100));
        }
        for (int i = 0; i < 5; i++)
        {
            p1.add(getDoubleRandom(30.56, 68.4, "##.###"));
        }
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("p：").append(p).append('\n');
        stringbuilder.append("p1：").append(p1);
        return stringbuilder.toString();
    }
}
