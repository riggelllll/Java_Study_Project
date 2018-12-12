package Java_help_ru;

class Task3 {
    double arr[];

    Task3(){
        arr = new double[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i+50;
        }
    }

    void update(int index, double array[]){
        System.out.println("BEFORE " + array[index]);
        array[index] = (array[index] * 0.1) + array[index];
        System.out.println("AFTER " + array[index]);
    }
}
