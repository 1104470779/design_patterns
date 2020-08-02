package com.ljm.study.design.pattern.creational.singleton;

/**
 * @author liujiaming
 */
public class LazyDoubleCheckSingleton {
    //避免重排序，线程安全的延迟初始化
    //多线程得时候cpu有共享内存，在加了volatile后，所有的线程都能看到共享内存的最新状态，保证了内存的可见性
    //用volatile 修饰得共享变量得时候，在进行写操作的时候，将当前处理器缓存行得数据写回到主内存。这个写的操作，会使其他线程工作内存数据无效，所以其他线程会重新读取主内村得数据
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    //私有构造器
    private LazyDoubleCheckSingleton(){

    }

    //降低synchronized加在方法上得时候的开销，其实就是降低了锁的条件，使锁的范围更精确
    //以后再调用getInstance的时候，都不需要立即枷锁
    public static LazyDoubleCheckSingleton getInstance(){
            //懒汉式的写法，使用的时候再创建
            if(lazyDoubleCheckSingleton==null){
                synchronized (LazyDoubleCheckSingleton.class){
                    if(lazyDoubleCheckSingleton==null){

                        //关于对象创建过程的重排序，2、3得顺序有可能被颠倒
                        //1、分配内存给对象
                        //3、设置lazyDoubleCheckSingleton 指向刚分配得内存地址
                        //2、初始化对象
//                        JVM规定 intra-thread semantics 规定，保证重排序不会改变单线程得执行结果 例如
//                        2、3互换位置不会改变单线程得程序执行结果（也就是保证不会影响程序执行结果的重排序）
//                       -----//3、设置lazyDoubleCheckSingleton 指向刚分配得内存地址
                        lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    }
                }
            }
            return lazyDoubleCheckSingleton;
    }
}
