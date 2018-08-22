public class Calculator{
    
    public static int evaluate(String expression){
        int sum = 0;
        String[] s = new String[5];
        String aux = "";

        if(expression.matches("^(\\d[\\+\\-]{1})+\\d+$")){
            s = expression.split("\\+");

            for(int i = 0; i < s.length; i++){
              if(s[i].matches("^(\\d[\\-]{1})+\\d+$")){
                aux += s[i] + " ";  
                s[i] = "0";
              }
            }
        }

        String[] sub = aux.split("\\-");
        int subAux = 0;

        for(String summand : s){
            sum += Integer.valueOf(summand);
        }

        for(int i = 0; i < sub.length; i++){
            //subAux = Integer.valueOf(sub2[i]) - Integer.valueOf(sub2[i+1]);
            System.out.print(sub[i]+ " "); 
        }

        for(String a: s)
          System.out.print(a+ " ");

        return sum;
    }

    public static void main(String[] args){
        System.out.println("\nValor da soma = " +evaluate("5+3-1+2-1"));
    }
}
