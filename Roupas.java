package ProjetoCeu;

import java.util.Scanner;

public class Roupas extends Doacoes{
	
	private int agasalho;
	private int camiseta;
	private int calca;
	private int tenis;
	private int cuecas;
	private int calcinha;
	private int meia;
	
	Scanner leia = new Scanner(System.in);
	
	public Roupas(String nome, String endereco, int idade,int agasalho,int camiseta,int calca,int tenis,int cuecas,int calcinha,int meia) {
	
	super(nome,endereco,idade);
	this.agasalho = agasalho;
	this.camiseta = camiseta;
	this.calca = calca;
	this.tenis = tenis;
	this.cuecas = cuecas;
	this.calcinha = calcinha;
}

	public int getAgasalho() {
		return agasalho;
	}
	public void setAgasalho(int agasalho) {
		this.agasalho = agasalho;
	}
	public int getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(int camiseta) {
		this.camiseta = camiseta;
	}
	public int getCalca() {
		return calca;
	}
	public void setCalca(int calca) {
		this.calca = calca;
	}
	public int getTenis() {
		return tenis;
	}
	public void setTenis(int tenis) {
		this.tenis = tenis;
	}
	public int getCuecas() {
		return cuecas;
	}
	public void setCuecas(int cuecas) {
		this.cuecas = cuecas;
	}
	public int getCalcinha() {
		return calcinha;
	}
	public void setCalcinha(int calcinha) {
		this.calcinha = calcinha;
	}
	public int getMeia() {
		return meia;
	}
	public void setMeia(int meia) {
		this.meia = meia;
	}
	
	public void imprimirInfo() {
		System.out.println("*************Recebimento do Doador**************");
		System.out.println("Nome do Doador:"+getNome()+"\n"+"Endereco:"+getEndereco()+"\n"+"Idade do Doador:"+getIdade()+
				"\n"+"Agasalhos:"+agasalho+"\n"+"Camisetas:"+camiseta+"\n"+"Calças:"+calca+"\n"+"Tenis:"+tenis+
				"\n"+"Cuecas:"+cuecas+"\n"+"Calcinhas:"+calcinha+"\n"+"Meias:"+meia);
	}
	/*public void calcularDoacoes() {
		for(x=0;x<5;x++) {	
		int roupasTotal = agasalho+camiseta+calca+tenis+cuecas+calcinha+meia;
		roupasTotal = roupasTotal + media;
		System.out.println("\nTotal de Roupas Recebidas:"+roupasTotal);
	}*/
	
}
