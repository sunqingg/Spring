package com.sun.qing.proxy;

import com.sun.qing.dao.UserDao;
import com.sun.qing.dao.impl.UserDaoImpl;

import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
// Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces,new InvocationHandler() {
// @Override
// public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
// return null;
// }
// });
        UserDaoImpl userDao = new UserDaoImpl();
        // 增强功能 上面用到了reflect类说明也是用到的反射的功能
        UserDao dao =
                (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces,
                        new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println("result:"+result);
    }
}
