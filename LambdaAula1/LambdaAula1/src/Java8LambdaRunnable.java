public class Java8LambdaRunnable {
    public static void main(String[] args) throws Exception {
        
        // JAVA 8: FUNÇÕES LAMBDA

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Olá mundo!");
            }
        }).run();
    }
}
