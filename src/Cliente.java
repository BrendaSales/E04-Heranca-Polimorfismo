import java.util.Date;
public class Cliente {

        String nome;
        Date data;
        String endereco;

        Cliente (){
            this.data =  new Date();
        }

        void imprimir (){
            System.out.println("Cliente invalido");
        }

    }
