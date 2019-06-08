public class Codigo1 implements Operador{

private Operador codi1;
    
    String msgm1;  
    
    public Codigo1(Operador codi1) {
        this.setCodi1(codi1);   }
    
    public Codigo1(Numero codi1, long vl1) {  }
    @Override
	public long inter() {
		return this.codi1.inter();	}	
//----------------------------------------------   
	@Override
	public String interpretar11() {
		if(inter()==11){
	    	msgm1 = "Whey";}
	    	else{if(inter()==22){
	    		msgm1 = "Cereal";
	    	}else{
	    		msgm1 = null;	} 	}
	    	return msgm1;	}

	@Override
	public String interpretar10() {
		// TODO Auto-generated method stub
		return null;	}

	public Operador getCodi1() {
		return codi1;	}

	public void setCodi1(Operador codi1) {
		this.codi1 = codi1;	}
}
