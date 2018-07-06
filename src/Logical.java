import java.io.IOException;

/**
 * Created by SretenskyVD on 03.07.2018.
 */

public class Logical {

    public static void main(String args[]) throws java.io.IOException {

        char choice, ignore;

        do {
            System.out.println("Справка");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while");
            System.out.println("Make your choice:");


            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        }
        while (choice < '1' | choice > '5');

        switch (choice) {
            case '1':
                System.out.println("Оператов if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Оператов switch:\n");
                System.out.println("switch(условие) оператор;");
                System.out.println("case константа");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Оператов for:\n");
                System.out.println("for(иницаализация; условие; итерация)");
                System.out.println(" оператор;");
                break;
            case '4':
                System.out.println("Оператов while:\n");
                System.out.println("while(условие) оператор;");
                break;
            case '5':
                System.out.println("Оператов do-while:\n");
                System.out.println("do {");
                System.out.println("оператор");
                System.out.println(" } while (условие);");
                break;
        }


    }

}
