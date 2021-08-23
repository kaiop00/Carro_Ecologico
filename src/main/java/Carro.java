public class Carro {

    public int passageiros = 0;
    public int combustivel = 0;
    public int quilometragem = 0;

    public int getPassageiros() {
        return passageiros;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public boolean dirigir(int percorrido) {
        while(combustivel == 0){
            return false;
        }
        if(percorrido >= combustivel){
            quilometragem = quilometragem + combustivel;
            combustivel = 0;
            return false;
            
        }
        else{
            combustivel = combustivel - percorrido;
            quilometragem = quilometragem + percorrido;
            return true;
        } 
    }
    public boolean embarcar() {
    	if(passageiros > 1) {
    		return false;   	}
    	else{
            passageiros += 1; 
            return true;
        }
    }

    public boolean desembarcar() {
    	if(passageiros < 1) {
    		return false;
    	}
    	else {
            passageiros -= 1; 
            return true;
        }
    }

    public boolean abastecer(int total) {
        while(total + combustivel >= 100) {
        	combustivel = 100;
        	return true;
       
        }
        if (total <= 0) {
        	return false;
        }
        else {
        	combustivel = combustivel + total;
        	return true;
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "passageiros=" + getPassageiros() +
                ", combustivel=" + getCombustivel() +
                ", quilometragem=" + getQuilometragem() +
                '}' + 
                "\n";
    }
}