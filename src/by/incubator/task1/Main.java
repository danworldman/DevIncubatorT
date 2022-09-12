package by.incubator.task1;

public class Main {
    public static void main(String[] args) {
        Class<Main> clazz = Main.class;
        printClassLoaderAndHisParents(clazz);

        Class<Integer> integerClass = Integer.class;
        printClassLoader(integerClass);

        Class<MyClass> myClassClass = MyClass.class;
        printClassLoaderAndHisParents(myClassClass);
    }

    private static void printClassLoaderAndHisParents(Class clazz){
        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println("class loader " + clazz + " is " + "\n"+ classLoader);
        System.out.println("Its parent: " + "\n"+ classLoader.getParent());
        System.out.println("Parent of its parent: " + "\n"+  classLoader.getParent().getParent());
        System.out.println();
    }

    private static void printClassLoader(Class clazz){
        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println("class loader: " + clazz + " is " + "\n" + classLoader);
        System.out.println("but why null? ");
        System.out.println();
    }
}