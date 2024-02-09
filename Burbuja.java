public class Main {
    public static void main(String[] args) {
        int[] lista = {1,4,3,5,3,8};
        int len = lista.length;
        for (int i = 0 ; i < len ; i++){
            for (int j = 0; j < len ; j++){
                if (lista[i] < lista[j]){
                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
            }
        }
        for (int i = 0; i < len ; i++){
            System.out.println(lista[i]);
        }

    }
}
