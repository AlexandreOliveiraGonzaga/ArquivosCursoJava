package Classe;

public class Data {
	
	//CRIANDO OS ATRIBUTOS
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaNovo, int mesNovo, int anoNovo){
		
		dia = diaNovo;
		mes = mesNovo;
		ano = anoNovo;
		
	}
	
	String dataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
