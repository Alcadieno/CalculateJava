public class Calculate {
    public static void main (String[] args){
    int x = Integer.parseInt(args[1]); // Transforma primitivo em não Primitivo
    int y = Integer.parseInt(args[2]);
        //Java.lang pacote do Interger não e preciso importar
        // Objetos são tipos não primitivos, necessitam de mais memória

        if(args[0].equals("somar")){  // Estrutura condicional IF
            sum(x,y);// A Função sum é chamada para aplicar os atributos contidos nos ARRAYS
        }else if (args[0].equals("subtrair")){
            minus(x,y);// A Função minus é chamada para aplicar os atributos contidos nos ARRAYS
        }else if (args[0].equals("multiplicar")){
            multi(x,y);// A Função multi é chamada para aplicar os atributos contidos nos ARRAYS
        }else if (args[0].equals("dividir")) {
            div(x,y); // A Função Div é chamada para aplicar os atributos contidos nos ARRAYS
        }

    }
    private static void div(int x, int y){ //Isso é uma funçaõ que faz uma div
        if (x%y >= 1) {
            System.out.println("Essa eh uma divisao com resultado=" + x/y + "E resto ="+ x%y);

        }else {
            System.out.println("Essa eh uma divisao exata ="+ x/y);
        }
        }
    private static void multi(int x, int y){ //Isso é uma função que faz uma multiplicação
        System.out.println(x*y);
    }
    private static void minus(int x, int y) {//Isso é uma função que faz uma subtração
        System.out.println(x-y);
    }

    static void sum ( int x , int y){//Isso é uma função que faz uma soma
        System.out.println(x+y);
    }
}
// Primeiro, o nome do programa é respresentado por PUBLIC CLASS CALCULATE
// Segundo , guardar as Variaveis  primitivas e do tipo INT ,em ARGS
        /* Depois o método main receberá  uma coleção de argumentos do tipo STRING
        por isso é necessário "CONVERTER" o tipo STRING com INTERGER.PARSEINT para  INT
        Apos isso utilizando a estruturua condicional IF é possível diferenciar as operações
        solicitadas (Somar, Multiplicar , Dividir)
        */



