package com.exercises.basics;

/**
 * Ця демонстрація демонструє, чому використання Object небезпечно.
 * Це небезпечно, оскільки кастинг під час виконання може спричинити винятки під час виконання.
 * Ми завжди повинні знаходити такі помилки якомога швидше.
 * Тому в цьому коді ми не повинні дозволяти встановлення значення String під час компіляції,
 * якщо ми очікуємо працювати з цілими числами.
 */
public class BoxDemoApp {
    public static void main(String[] args) {
        Box intBox = new Box(123);
        Box intBox2 = new Box(321);
        System.out.println((int) intBox.getValue() + (int) intBox2.getValue());

        intBox.setValue(222);
        intBox.setValue("abc"); // this should not be allowed
        // the following code will compile, but will throw runtime exception
        System.out.println((int) intBox.getValue() + (int) intBox2.getValue());
    }
}
