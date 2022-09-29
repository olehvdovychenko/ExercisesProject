package com.exercises.basics;

/**
 * {@link Box} це клас-контейнер, який може зберігати значення будь-якого заданого типу.
 * Використання Object як типу поля є гнучким, оскільки ми можемо зберігати там усе, що забажаємо.
 * Але це небезпечно, оскільки вимагає кастингу під час виконання, і немає гарантії, що ми знаємо тип збереженого значення.
 * <p>
 * todo: відрефакторіть цей клас, щоб він використовував загальний тип "T", і запустіть {@link com.exercises.basics.BoxTest}, щоб перевірити його
 */
public class Box {
    private Object value;

    public Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
