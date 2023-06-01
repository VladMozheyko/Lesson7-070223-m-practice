public class Main {

    /*
    План занятия
    1) Стеки
    2) Очереди
     */

    /*
    Теория
    В информатике широко применяются 2 принципа работы: LIFO и FIFO
    LIFO(Last in first out) - Последним пришел, первым ушел(Стек)
    FIFO(First in first out) - Первым пришел, первым ушел(Очередь)
    Стек - структура данных, которая поддерживает операции добавления в конец структуры и извлечения из конца структуры
    Очередь -  структура данных, которая  поддерживает операции добавления в конец структуры и извлечения из начала
    структуры
    Примеры из реальной жизни:
    Очередь - обычная очередь в магазине
    Стек - стопка тарелок, блинов и т.д.
    В информатике часто приходится использовать подобные структуры данных для решения системных вопросов или специфических
    задач программирования

     */

    /*
    Заметки
    Применения очереди: Блокирующая очередь - Рабочий поток
    Применения стека - цепочка вызовов элементов программы

    TODO - указание в комментариях к программе, что нужно сделать в будущем
     */

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.display();
        stack.trace();
        System.out.println("Pop: " + stack.pop());  // В эту точку, кроме управления программой, метод вернул еще и значение
        stack.display();
        stack.trace();
        System.out.println("Peek: " + stack.peek());
        stack.display();
        stack.trace();
        System.out.println("Pop: " + stack.pop());
        stack.display();
        stack.trace();
        System.out.println("Pop: " + stack.pop());
        stack.display();
        stack.trace();
        System.out.println("Pop: " + stack.pop());
        stack.display();
        stack.trace();
        System.out.println("Начинаем добавление в стек: ");
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(2);
        stack.display();
        stack.trace();
        stack.push(3);
        stack.display();
        stack.trace();
        stack.push(3);
        stack.display();
        stack.trace();

        System.out.println("Работаем с очередью: ");
        Queue queue = new Queue();
        queue.add(1);
        queue.display();
        queue.trace();
        queue.add(2);
        queue.display();
        queue.trace();
        queue.add(3);
        queue.display();
        queue.trace();
        System.out.println("Remove: " + queue.remove());
        queue.display();
        queue.trace();

        /*
        ДЗ
        1) Дописать очередь.
        2) Реализовать каждую структуру через списки
        Задачи для ветеранов:
        3*) Добавить работу с исключениями там где это нужно(добавление)
        4*) Реализовать WorkingThread и блокирующую очередь

         */






    }
}
