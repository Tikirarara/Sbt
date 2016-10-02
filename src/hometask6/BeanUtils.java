package hometask6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;

public class BeanUtils {
    /**
     * Scans object "from" for all getters. If object "to"
     * contains correspondent setter, it will invoke it
     * to set property value for "to" which equals to the property
     * of "from".
     * <p/>
     * The type in setter should be compatible to the value returned
     * by getter (if not, no invocation performed).
     * Compatible means that parameter type in setter should
     * be the same or be superclass of the return type of the getter.
     * <p/>
     * The method takes care only about public methods.
     *
     * @param to   Object which properties will be set.
     * @param from Object which properties will be used to get values.
     */

    public static void assign(Object to, Object from) {
        List<ArrayList<Method>> actualMetods = selecting(to, from);
        try {
            for (int i = 0; i < actualMetods.get(0).size(); i++) {
                actualMetods.get(0).get(i).invoke(to, actualMetods.get(1).get(i).invoke(from));
            }
        } catch (IllegalAccessException | InvocationTargetException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<Method> getMethodsWithKey(Object o, String keyword) {
        Class<?> clazz = o.getClass();
        Method[] methods = clazz.getMethods();
        List<Method> allMethodsWithKey = new ArrayList<>();
        for (Method method : methods) {
            if (method.getName().startsWith(keyword))
                allMethodsWithKey.add(method);
        }
        return allMethodsWithKey;
    }

    public static boolean compareMethods(Method setter, Method getter) {
        Boolean nameEquals = setter.getName().substring(3)
                .equals(getter.getName().substring(3));
        Boolean parametersCompatible = false;
        if (setter.getParameterCount() == 1) {
            parametersCompatible = getter.getReturnType()
                    .isAssignableFrom(setter.getParameters()[0].getType());
        }
        return nameEquals && parametersCompatible;
    }

    public static List<ArrayList<Method>> selecting(Object to, Object from) {
        List<Method> setters = getMethodsWithKey(to, "set");
        List<Method> getters = getMethodsWithKey(from, "get");
        List<ArrayList<Method>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        for (Method set : setters) {
            for (Method get : getters) {
                if (compareMethods(set, get)) {
                    result.get(0).add(set);
                    result.get(1).add(get);
                }
            }
        }
        return result;
    }
}
