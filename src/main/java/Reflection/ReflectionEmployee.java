package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionEmployee {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        Class employeeClass = Class.forName("Reflection.Employee");

        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field = " + someField.getType());
        System.out.println("*****");

        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("*****");

        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println(" Возвраащающий метод повышения зп = " + someMethod1.getReturnType() + " , а параметры метода  = " +
                Arrays.toString(someMethod1.getParameterTypes()));

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println(" Возвраащающий метод установления зп = " + someMethod2.getReturnType() + " , а параметры метода  = " +
                Arrays.toString(someMethod2.getParameterTypes()));

        System.out.println("*****");
        Method [] allMethods = employeeClass.getMethods();
        for( Method method: allMethods){
            System.out.println("Имя метода = " + method.getName() + ", тип метода = " + method.getReturnType() + ", параметры метода = " +
                    Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("*****");
        Method [] allMethods2 = employeeClass.getDeclaredMethods();
        for( Method method: allMethods){
            System.out.println("Имя метода = " + method.getName() + ", тип метода = " + method.getReturnType() + ", параметры метода = " +
                    Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("*****");
        Method [] allMethods3 = employeeClass.getDeclaredMethods();
        for( Method method: allMethods){
            if(Modifier.isPublic(method.getModifiers()))
            System.out.println("Имя метода = " + method.getName() + ", тип метода = " + method.getReturnType() + ", параметры метода = " +
                    Arrays.toString(method.getParameterTypes()));
        }
    }
}
