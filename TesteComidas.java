package ProjetoCeu;

public class TesteComidas {

	public static void main(String[] args) {
		
         Comidas [] lista = new Comidas[5];
		
		System.out.println("********************Doa��es******************************");
		
		lista[0] = new Comidas("Jaqueline","Rua Zeca, 95",24,4,2,2,1,3,3,2);
		//Idade,Agasaglo,Camita,Cal�a,Tenis,Cueca,Calcinha,Meia
		lista[1] = new Comidas("Fernanda","Rua das Flores,22",28,7,10,10,3,5,5,3);
		lista[2] = new Comidas("Janaina","Rua da Maria, 100",21,12,8,7,6,9,12,15);
		lista[3] = new Comidas("Debora","Avenidade Duque de Caxias, 2",22,2,3,7,6,5,10,15);
		lista[4] = new Comidas("Guilherme","Rua das Arvores, 91",22,21,7,28,9,18,6,3);
		
		for(Comidas roda:lista) {
			
	        roda.imprimirInfo();
		}
		
	}

}
