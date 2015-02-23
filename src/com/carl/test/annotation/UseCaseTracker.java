package com.carl.test.annotation;



import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Carl on 15-2-4.
 */
public class UseCaseTracker {
    public static void trackUseCase(List<Integer> useCase,Class<?> c){
        for(Method m:c.getDeclaredMethods()){
           UseCase uc = m.getAnnotation(UseCase.class);
            if(uc != null){
                System.out.println("Find Use Case :"+uc.id()+"desc:"+uc.desc());
                useCase.remove(new Integer(uc.id()));
            }
        }
        for(int i:useCase){
            System.out.println("Warring...missing:"+i);
        }
    }

    public static void main(String[]main){
        List<Integer> useCase = new ArrayList<Integer>();
        Collections.addAll(useCase,10,23,24);
        trackUseCase(useCase,Test.class);
    }
}
