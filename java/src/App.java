
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
    //  5: é quantidade de elementos
    // é utilizado quando não se sabe o conteudo dos elementos, porém você sabe o limite de elementos a serem guardados

    int[] meu_array = new int [5];
    
    //Acesso rápido para guardar valores
    meu_array[0] = 10;
    meu_array[1] = 20;
    meu_array[2] = 30;
    meu_array[3] = 40;
    meu_array [4] = 50;

    //acesso rápido para recuperar os valores
    // System.out.println(meu_array[3]);

    int var2 = meu_array[2];
    
    // System.out.println(var2);

    //acesso possicional ou percorrer o vetor

    for (int i=0;i< meu_array.length;i++){
            System.out.println("Posição: "+ i + " Tem o Conteudo: "+meu_array[i]);
    }

    // quando já sabe o conteúdo dos elementos 
    // eles são atribuidos junto a declaração
    String[] aluno = {"Felipe","Breno", "Pedro", "João", "Matheus", "Gabriel", "Filipe", "Yuri"};
    // System.out.println("O aluno se chama: "+aluno[3]);

    // re-atribuindo valor em uma posição
    aluno[3]= "Gabriele";
    // System.out.println("O aluno se chama: "+aluno[3]);

    for(int i=0; i<aluno.length;i++){
        System.out.println("Posição: "+i+ " Tem o nome: "+aluno[i]);
    }
    
   // verificar a quantidade de elementos 
   System.out.println(meu_array.length);
   System.out.println(aluno.length);

   //converter em texto um array
   System.out.println(Arrays.toString(aluno));


   //copiando um vetor 
   //tipagem e a quantidade de elementos 
   int[] meu_array2 = meu_array.clone();
   
   // não permiti atribui dessa maneira
   //int[] meu_array3 = meu_array[]; 

   //manualmente - NÃO RECOMENDO 
    int[] meu_array3 = new int [5];
    meu_array3[0] = meu_array[0];
    meu_array3[1] = meu_array[1];
    meu_array3[2] = meu_array[2];
    meu_array3[3] = meu_array[3];
    meu_array3[4] = meu_array[4];

    //percorrendo por loop: RECOMENDO para situações de validação
    int[] meu_array4 = new int[5];
    for (int i=0; i<meu_array.length; i++){
        meu_array4[i] = meu_array[i];
    }
    // similar a função
    int[] meu_array5 = meu_array;

    // System.out.println(Arrays.toString(meu_array2));
    // System.out.println(Arrays.toString(meu_array3));
    // System.out.println(Arrays.toString(meu_array4));
    // System.out.println(Arrays.toString(meu_array5));

    //copiar uma parte da meu array pela função: COPYOF
    String[] discentes = Arrays.copyOf(aluno, 5);

    System.out.println(Arrays.toString(discentes));

    //organizando elementos pela função: SORT
    int[] des ={10,5,8,0,1,3,2,4,6,7,9};
    System.out.println(Arrays.toString(des));
    Arrays.sort(des);
    System.out.println(Arrays.toString(des));

    // Arrays.sort(aluno);
    System.out.println(Arrays.toString(aluno));

    System.out.println(aluno[3]);
    
    // UTILIZANDO A FUNÇÕA FILL:
    int[] meu_array6 = new int[5];
    Arrays.fill(meu_array6, 2);
    
    System.out.println(Arrays.toString(meu_array6));
    
    
    // UTILIZANDO A FUNÇÃO: EQUALS
    boolean res = Arrays.equals(meu_array,meu_array2);
    // System.out.println(res);

    // quando as tipagens são diferentes o equals não funciona. Exemplo errado:
    //res = Arrays.equals(meu_array, aluno);

    // res = Arrays.equals(aluno, discentes);

    // String[] aluno_fatec = aluno;

    String[] aluno_fatec = aluno.clone();
    System.out.println(Arrays.toString(aluno));
    System.out.println(Arrays.toString(aluno_fatec));
    res=Arrays.equals(aluno, aluno_fatec);
    System.out.println(res);
    
    Arrays.sort(aluno);
    System.out.println(Arrays.toString(aluno));
    System.out.println(Arrays.toString(aluno_fatec));

    res=Arrays.equals(aluno, aluno_fatec);
    System.out.println(res);

    // UTILIZANDO A FUNÇÃO: BINARYSEARCH
    int indice = Arrays.binarySearch(aluno, "Yuri");
    System.out.println(indice);

    //ERROS:
    //ACESSO AO INDEX INEXISTENTE

    // System.out.println(aluno[8]);
    //aluno[8] = "Kaue";

    //ATRIBUIÇÃO DE TIPAGEM ERRADA
    // meu_array[0] = "Kaue";
    }
}
