package aprl.compiler;

import java.util.*;

public class Test<A> {
    
    public static final String NAME = "Hi";
    public static final int WIDTH = 7;
    private static final int HEIGHT = 9;
    
    public static class Test1 {
        public static final String YES = "Yes";
    }
    
    public static <T> void test(T t) {
        System.out.println(t);
    }
    
}
