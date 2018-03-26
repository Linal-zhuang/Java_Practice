package com.example.simpleFactory;

/**
 * Created by ZLX on 2018/3/23.
 */

public class SimpleFactoryReflex {

    public static Human makeHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.print("don't support abstract class or interface\n");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.print("no permission to visit private class");
        } catch (IllegalAccessException e) {
            System.out.print("class is no exist");
            e.printStackTrace();
        } finally {

        }

        return human;
    }
}
