import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.security.SecureRandom;
import java.util.Random;

public class ArrayListTest {
    public static void main(String args[]) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList();
        // вывод количества элементов в массиве или же размер массива (ожидаемый результат 0)
        System.out.println("\n");// \n переход к новой строке он же newline
        System.out.println("Initial size of this Array List: " + arrayList.size());
        // добавление элементов в массив
//        arrayList.add("M");//0-й элемент массива
//        arrayList.add("A");//1-й элемент массива
//        arrayList.add("V");//2-й элемент массива
//        arrayList.add("E");//3-й элемент массива
//        arrayList.add("N");//4-й элемент массива
//        arrayList.add(1,"M1");//вставляет значение в 1-м элементе массива, на М1
        // вывод количества элементов в массиве или же размер массива (ожидаемый результат 6)
        System.out.println("Initial size of Array List after adding items:" + arrayList.size());
        //вывод всех элементов массива на экран
        System.out.println("ArrayList contains:" + arrayList);
        //удаление элементов из массива
//        arrayList.remove("V");//Удаление по индексу
//        arrayList.remove(0);//удаление по номеру элемента
        //вывод на экран размер массива после удаления элементов (ожидаемый результат 4)
        System.out.println("Initial size of Array Liest after removing" + arrayList);
        //вывод на экран все элементы массива(ожидаемый результат - конечный массив M1, A, E, N)
        System.out.println("ArrayList contains after removing" + arrayList);
        //Использую библеотеку с генератором рандомных чисел
        arrayList.clear();
//        arrayList.add(generateRandom());//0-й элемент массива
//        arrayList.add(generateRandom());//0-й элемент массива
//        arrayList.add(generateRandom());//0-й элемент массива
//        arrayList.add(generateRandom());//0-й элемент массива
//        arrayList.add(generateRandom());//0-й элемент массива
//        arrayList.add(generateRandom());//0-й элемент массива
        System.out.println("ArrayList contains after removing" + arrayList);
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(10));
        }

        for (int i = 0; i < arrayList.size(); i++){
//            System.out.println(eachElement);
            if(arrayList.get(i) < arrayList.get(i+1))
            {
            arrayList;

            } else {

            }
        }

//        arrayList.clear();
//        arrayList.add(random.nextInt(10));
    }

    private static String generateRandom() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }


}
