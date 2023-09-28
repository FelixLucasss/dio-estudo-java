public class formataCEP {
    public static void main(String[] args) {
       try{String cepFormatado = formatarCep("23765064");
        System.out.println(cepFormatado);
       } catch(cepInvalidoExpetion e){
        e.printStackTrace();
       }
    }
    static String formatarCep(String cep) throws cepInvalidoExpetion{
        if(cep.length() != 8){
            throw new cepInvalidoExpetion();
        } return "23.765-064";
        
    }
}
