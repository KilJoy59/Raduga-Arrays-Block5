public class Main {
    public static void main(String[] args) {
        String[] raduga = {"Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};

        for (int i = 0; i < raduga.length; i++) {
            System.out.print(raduga[i] + " ");
        }

        int middleOfArray = (raduga.length+1)/2;

        for (int i = 0; i < raduga.length/2 ; i++) {
            String temp = raduga[i];
            raduga[i] = raduga[(middleOfArray +2)-i];
            raduga[(middleOfArray +2)-i] = temp;
    }
        System.out.println("");
        for (int i = 0; i < raduga.length; i++) {
            System.out.print(raduga[i] + " ");
        }
    }
}
