/*
Задача
1) Сделать базовые операции для очереди: add, remove, element
2) Трассировка и отображение памяти
3) Массив для хранения элементов и указатель на
 */
public class Queue {
    //TODO подумать над реализацией через списки
    private Object[] arr = new Object[5];     // Массив, в котором будут хранится значения очереди
    private int cursorStart = 0;              // Указатель на начало очереди
    private int cursorEnd = 0;                // Указатель на конец очереди

    public void add(Object element){
        arr[cursorEnd] = element;
        cursorEnd++;
    }

    public Object remove(){
        int start = cursorStart;              // Запоминаем текущий элемент в очереди
        cursorStart++;                        // Очередь переходит к другому элементу
        return arr[start];                    // Возвращаем текущий элемент
    }

    public void display(){
        System.out.println("Отображение памяти: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void trace(){
        System.out.println("Отображение очереди: ");
        for (int i = cursorStart; i < cursorEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
