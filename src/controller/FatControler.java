package controller;
import br.edu.fateczl.pilhaint.*;

public class FatControler {

	public FatControler() {
		super();
	}
	
	public int Fat(int n) {
		Pilha p = new Pilha();
		int fat = 1;
		if(n == 0){
			return fat;
			}else{
				for (int i =1; i <=n; i++){
					p.push(i);
				}
				while(!p.isEmpty()){
					try {
						fat = p.pop()*fat;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
				return fat;
			}
	}

}
