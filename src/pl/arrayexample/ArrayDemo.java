package pl.arrayexample;

class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;
        for (i=0; i<sample.length; i++){
            sample[i] = i;
        }

        for (i=0; i<sample.length; i++){
            System.out.println("Element sample [" + i + "]: " + sample[i]);
        }
    }
}
