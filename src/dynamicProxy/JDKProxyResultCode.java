package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * 动态代理中生成的代理类的字节码进行反编译后的类代码
 */
public class JDKProxyResultCode {
    /**
     * 下面 $Proxy0 这个类是从网上找的, https://blog.csdn.net/dulabing/article/details/89638062
     */
    static final class $Proxy0 extends Proxy implements HelloService {
        private static Method m1; //equals()方法
        private static Method m3; //Bingo 我们的sayHello方法()
        private static Method m2; //toString()方法
        private static Method m0; //hashCode()方法

        static {
            try {
                m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[]{Class.forName("java.lang.Object")});
                m3 = Class.forName("proxy.service.HelloService").getMethod("sayHello", new Class[0]);
                m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
                m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
            } catch (NoSuchMethodException var2) {
                throw new NoSuchMethodError(var2.getMessage());
            } catch (ClassNotFoundException var3) {
                throw new NoClassDefFoundError(var3.getMessage());
            }
        }

        //这里就是我们之前提交的InvocationHandler这个构造方法！！
        public $Proxy0(InvocationHandler var1) {
            super(var1);
        }

        public final boolean equals(Object var1) {
            try {
                return ((Boolean) super.h.invoke(this, m1, new Object[]{var1})).booleanValue();
            } catch (RuntimeException | Error var3) {
                throw var3;
            } catch (Throwable var4) {
                throw new UndeclaredThrowableException(var4);
            }
        }

        //勇士来吧！看一看我们的代理类的sayHello()方法长什么样子呀！！
        public final void sayHello() {
            try {
                super.h.invoke(this, m3, (Object[]) null);
            } catch (RuntimeException | Error var2) {
                throw var2;
            } catch (Throwable var3) {
                throw new UndeclaredThrowableException(var3);
            }
        }

        public final String toString() {
            try {
                return (String) super.h.invoke(this, m2, (Object[]) null);
            } catch (RuntimeException | Error var2) {
                throw var2;
            } catch (Throwable var3) {
                throw new UndeclaredThrowableException(var3);
            }
        }

        public final int hashCode() {
            try {
                return ((Integer) super.h.invoke(this, m0, (Object[]) null)).intValue();
            } catch (RuntimeException | Error var2) {
                throw var2;
            } catch (Throwable var3) {
                throw new UndeclaredThrowableException(var3);
            }
        }

    }
}
