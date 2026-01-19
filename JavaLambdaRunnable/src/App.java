public class App {
    public static void main(String[] args) throws Exception {
        

        //MODELO ANTIGO DE THREAD SEM LAMBDA:
        new Thread( new Runnable() {

            @Override
            public void run() {
                System.out.println("Olá mundo!");
            }
            
        }).start();
        
        
        //ATULIZANDO FUNÇÃO LAMBDA:
        new Thread(() -> System.out.println("Olá mundo")).start();

        //SAM - Single Abstratc Method
        //Qualquer interface que tenha apenas um método abstrato.
    }
}
