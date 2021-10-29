/**
 * Project name(项目名称)：注解
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/29
 * Time(创建时间)： 18:47
 * Version(版本): 1.0
 * Description(描述)：从 Java 5 版本之后可以在源代码中嵌入一些补充信息，这种补充信息称为注解（Annotation）
 * 注解都是 @ 符号开头的
 * 注解并不能改变程序的运行结果，也不会影响程序运行的性能。有些注解可以在编译时给用户提示或警告，
 * 有的注解可以在运行时读写字节码文件信息。
 * 注解常见的作用有以下几种：
 * 生成帮助文档。这是最常见的，也是 Java 最早提供的注解。常用的有 @see、@param 和 @return 等；
 * 跟踪代码依赖性，实现替代配置文件功能。比较常见的是 Spring 2.5 开始的基于注解配置。作用就是减少配置。现在的框架基本都使用了这种配置来减少配置文件的数量；
 * 在编译时进行格式检查。如把 @Override 注解放在方法前，如果这个方法并不是重写了父类方法，则编译时就能检查出。
 * 无论是哪一种注解，本质上都一种数据类型，是一种接口类型。到 Java 8 为止 Java SE 提供了 11 个内置注解。其中有 5 个是基本注解，
 * 它们来自于 java.lang 包。有 6 个是元注解，它们来自于 java.lang.annotation 包，自定义注解会用到元注解。
 * 元注解就是负责注解其他的注解。
 * 基本注解包括：@Override、@Deprecated、@SuppressWarnings、@SafeVarargs 和 @FunctionalInterface。
 */

public class test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        test_Override t1 = new test_Override("张三", 18, "男");
        System.out.println(t1);
        System.out.println("------------------");
        test_Deprecated t2 = new test_Deprecated();
        t2.setName("李四");
        t2.setAge(18);
        t2.setSex("男");
        System.out.println(t2.getName());
        System.out.println(t2.getAge());
        System.out.println(t2.getSex());
        System.out.println(t2);
        System.out.println("------------------");
        test_SuppressWarnings t3 = new test_SuppressWarnings();
        System.out.println(t3);
        System.out.println("------------------");
        test_SafeVarargs.main();
        System.out.println("------------------");
        test_FunctionalInterface t5 = new test_FunctionalInterface();
        t5.test1();
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
