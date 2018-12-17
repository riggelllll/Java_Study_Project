package Java_help_ru;

class Task25 {
    private double hrn, dol, course;
    private void convert(double hrn, double course){
        dol = hrn / course;
    }
    private void show(){
        System.out.println("Dollars " + dol);
    }
    void run(){
        convert(23000, 28.030);
        show();
    }
}
