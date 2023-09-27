public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarTv = new SmartTv();

        System.out.println("TV Ligada ? " + smarTv.ligada);
        System.out.println("Canal atual : " + smarTv.canal);
        System.out.println("Volume Atual : " + smarTv.volume);

        smarTv.ligar();
        System.out.println("TV Ligada ? " + smarTv.ligada);

        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        System.out.println("Volume Atual : " + smarTv.volume);

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        System.out.println("Volume Atual : " + smarTv.volume);

        smarTv.aumentarCanal();
        smarTv.aumentarCanal();
        System.out.println("Canal atual : " + smarTv.canal);
        smarTv.mudarCanal(13);
        System.out.println("Canal atual : " + smarTv.canal);

    }
}
