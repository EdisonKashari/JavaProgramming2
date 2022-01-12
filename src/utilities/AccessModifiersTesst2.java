package utilities;

import day_34_GarbageColletion_AccessModifiers.AccessModifiers;

public class AccessModifiersTesst2 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
         // System.out.println(AccessModifiers.defaultData);//default is not visible outside the package
        // System.out.println(AccessModifiers.privateData);//private is not visible outside the class

        AccessModifiers.method1();//public
    //    AccessModifiers.method2(); default is not visible outside of package
      //  AccessModifiers.method3(); private is not visible outside of class


    }
}
