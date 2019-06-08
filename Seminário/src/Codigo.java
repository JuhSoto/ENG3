public class Codigo implements Operador {

    private Operador codi;
    String msgm;
    
    public Codigo(Operador codi) {
        this.codi = codi;      }
    
    public Codigo(Numero codi, long vl) {	}
    
	@Override
    public long inter() {
        return this.codi.inter();    }
		
//----------------------------------------------
	@Override
	public String interpretar10() {
    	if(inter()==222){
    	msgm = "Marca Probiotica";}
    	else{if(inter()==333){
    		msgm = "Marca Integral";  }  }
    	return msgm;	}

	@Override
	public String interpretar11() {
	return null; }	
}
 