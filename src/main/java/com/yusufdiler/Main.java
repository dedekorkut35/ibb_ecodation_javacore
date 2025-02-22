package com.yusufdiler;


public class Main {
    // 2- Metotlar (ReturnsuzParametreli)
    public static void metotReturnsuzParametreli(String name){
        System.out.println("metot Returnsuz Parametreli "+name);
        int x=3;
        System.out.println(x);
    }    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            metotReturnsuzParametreli("name");
        }
    }
}