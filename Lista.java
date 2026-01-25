public class Lista{
	public static <T> T[] adicionarElemento(T[] arrayOriginal,T elemento){
		@SuppressWarnings("unchecked")
		T[] novoArray=(T[]) new Object[arrayOriginal.length+1];
		for(int iterador=0;iterador<arrayOriginal.length;iterador++){
			novoArray[iterador]=arrayOriginal[iterador];
		}
		novoArray[arrayOriginal.length]=elemento;
		return novoArray;
	}
}